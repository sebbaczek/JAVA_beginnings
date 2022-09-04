package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static creditProject.Utils.Calculation.calculateInterestAmount;

public class DecreasingAmountsCalculationServiceImpl implements DecreasingAmountsCalculationService{
        private static final BigDecimal YEAR = BigDecimal.valueOf(12);
        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = inputData.getAmount();
                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal referenceDuration = inputData.getMonthsDuration();
                BigDecimal referenceAmount = inputData.getAmount();

                BigDecimal capitalAmount = calculateCapitalAmount(referenceAmount, referenceDuration,residualAmount);
                BigDecimal rateAmount = capitalAmount.add(interestAmount);

                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
                BigDecimal interestPercent = inputData.getInterestPercent();
                BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount();
                BigDecimal referenceDuration = previousRate.getMortgageReference().getDuration();
                BigDecimal referenceAmount = previousRate.getMortgageReference().getAmount();
                BigDecimal interestAmount = calculateInterestAmount(residualAmount, interestPercent);
                BigDecimal capitalAmount = calculateCapitalAmount(referenceAmount, referenceDuration,residualAmount);
                BigDecimal rateAmount = capitalAmount.add(interestAmount);
                return new RateAmounts(rateAmount, interestAmount, capitalAmount, overpayment);
        }

//        public BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
//                return residualAmount.multiply(interestPercent).divide(YEAR, 20, RoundingMode.HALF_UP);
//
//        }

        private BigDecimal calculateCapitalAmount(BigDecimal amount, BigDecimal monthDuration,BigDecimal residualAmount) {
                BigDecimal capitalAmount = amount.divide(monthDuration,50,RoundingMode.HALF_UP);
                if(capitalAmount.compareTo(residualAmount)>=0){
                        return residualAmount;
                }
                return capitalAmount;
        }
}
