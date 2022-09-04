package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static creditProject.Utils.Calculation.calculateInterestAmount;

public class ConstantAmountsCalculationServiceImpl implements ConstantAmountsCalculationService{
        private static final BigDecimal YEAR = BigDecimal.valueOf(12);

        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment) {

                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal q = calculateQ(interestPercent);
                BigDecimal referenceAmount = inputData.getAmount();
                BigDecimal residualAmount = inputData.getAmount();
                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal referenceDuration = inputData.getMonthsDuration();
                BigDecimal rateAmount = calculateConstantRateAmount(q,referenceAmount, referenceDuration,interestAmount,residualAmount);
                BigDecimal capitalAmount = calculateCapitalAmount(rateAmount, interestAmount,residualAmount);

                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {

                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal q = calculateQ(interestPercent);

                BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();
                BigDecimal referenceAmount = previousRate.getMortgageReference().getAmount();
                BigDecimal referenceDuration = previousRate.getMortgageReference().getDuration();

                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal rateAmount = calculateConstantRateAmount(q, referenceAmount, referenceDuration,interestAmount,residualAmount);
                BigDecimal capitalAmount = calculateCapitalAmount(rateAmount, interestAmount,residualAmount);

                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }
        private BigDecimal calculateConstantRateAmount(BigDecimal q, BigDecimal amount, BigDecimal monthsDuration,BigDecimal interestAmount,BigDecimal residualAmount) {
                BigDecimal rateAmount = amount
//                return amount
                        .multiply(q.pow(monthsDuration.intValue()))
                        .multiply(q.subtract(BigDecimal.ONE))
                        .divide(q.pow(monthsDuration.intValue()).subtract(BigDecimal.ONE),20, RoundingMode.HALF_UP);
                return compareWithResidual(rateAmount,interestAmount,residualAmount);
        }

        private BigDecimal compareWithResidual(BigDecimal rateAmount,BigDecimal interestAmount,BigDecimal residualAmount) {
                if(rateAmount.subtract(interestAmount).compareTo(residualAmount)>=0){
                        return residualAmount.add(interestAmount);
                }
                return rateAmount;
        }

        private BigDecimal calculateCapitalAmount(BigDecimal rateAmount, BigDecimal interestAmount,BigDecimal residualAmount) {
                BigDecimal capitalAmount = rateAmount.subtract(interestAmount);
                if(capitalAmount.compareTo(residualAmount)>=0){
                        return residualAmount;
                }
                return capitalAmount;
        }
        private BigDecimal calculateQ(BigDecimal interestPercent) {
                return interestPercent.divide(YEAR, 10, RoundingMode.HALF_UP).add(BigDecimal.ONE);
        }
//        public BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
//                return residualAmount.multiply(interestPercent).divide(YEAR, 20, RoundingMode.HALF_UP);
//
//        }
}
