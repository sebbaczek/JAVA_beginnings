package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationServiceImp implements AmountsCalculationService {

        private static final BigDecimal YEAR = BigDecimal.valueOf(12);

        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
                switch (inputData.getRateType()) {
                        case CONSTANT:
                                return calculateConstantRate(inputData,overpayment);
                        case DECREASING:
                                return calculateDecreasingRate(inputData,overpayment);
                        default:
                        throw new MortgageException();
                }

        }


        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
                switch (inputData.getRateType()) {
                        case CONSTANT:
                                return calculateConstantRate(inputData,overpayment, previousRate);
                        case DECREASING:
                                return calculateDecreasingRate(inputData,overpayment, previousRate);
                        default:throw new MortgageException();

                }
        }

        private RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment) {

                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = inputData.getAmount();
                BigDecimal q = calculateQ(interestPercent);


                BigDecimal rateAmount = calculateConstantRateAmount(q,inputData.getAmount(),inputData.getMonthsDuration());

                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);

                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        private RateAmounts calculateConstantRate(InputData inputData, Overpayment overpayment, Rate previousRate) {

                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();
                BigDecimal q = calculateQ(interestPercent);

                BigDecimal rateAmount = calculateConstantRateAmount(q,inputData.getAmount(),inputData.getMonthsDuration());
                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal capitalAmount = calculateConstantCapitalAmount(rateAmount, interestAmount);
                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        private BigDecimal calculateConstantRateAmount(BigDecimal q, BigDecimal amount, BigDecimal monthsDuration) {
                return amount
                        .multiply(q.pow(monthsDuration.intValue()))
                        .multiply(q.subtract(BigDecimal.ONE))
                        .divide(q.pow(monthsDuration.intValue()).subtract(BigDecimal.ONE),20,RoundingMode.HALF_UP);

        }

        private BigDecimal calculateConstantCapitalAmount(BigDecimal rateAmount, BigDecimal interestAmount) {
                return rateAmount.subtract(interestAmount);
        }

        private BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
                return residualAmount.multiply(interestPercent).divide(YEAR, 20, RoundingMode.HALF_UP);

        }

        private BigDecimal calculateQ(BigDecimal interestPercent) {
                return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
        }

        private RateAmounts calculateDecreasingRate(InputData inputData, Overpayment overpayment) {
                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = inputData.getAmount();


                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal capitalAmount = calculateDecreasingCapitalAmount(residualAmount, inputData.getMonthsDuration());
                BigDecimal rateAmount = capitalAmount.add(interestAmount);

                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        private RateAmounts calculateDecreasingRate(InputData inputData, Overpayment overpayment, Rate previousRate) {
                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();


                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal capitalAmount = calculateDecreasingCapitalAmount(inputData.getAmount(), inputData.getMonthsDuration());
                BigDecimal rateAmount = capitalAmount.add(interestAmount);
                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        private BigDecimal calculateDecreasingCapitalAmount(BigDecimal amount, BigDecimal monthsDuration) {
                return amount.divide(monthsDuration,20,RoundingMode.HALF_UP);
        }
}
