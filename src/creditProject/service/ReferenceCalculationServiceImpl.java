package creditProject.service;

import creditProject.Model.*;

import java.math.BigDecimal;

public class ReferenceCalculationServiceImpl implements ReferenceCalculationService{


        @Override
        public MortgageReference calculate(InputData inputData) {
                return new  MortgageReference(inputData.getAmount(),inputData.getMonthsDuration());
        }
        @Override
        public MortgageReference calculate(InputData inputData, RateAmounts rateAmounts, Rate previousRate) {
                if(BigDecimal.ZERO.equals(previousRate.getMortgageResidual().getAmount())){
                        return new MortgageReference(BigDecimal.ZERO,BigDecimal.ZERO);
                }
                switch (inputData.getOverpaymentReduceWay()){
                        case Overpayment.REDUCE_PERIOD:
                                return new  MortgageReference(inputData.getAmount(),inputData.getMonthsDuration());
                        case Overpayment.REDUCE_RATE:
                                return reduceRateMortgageReference(rateAmounts,previousRate);
                        default:throw new MortgageException();
                }




        }

        private MortgageReference reduceRateMortgageReference(RateAmounts rateAmounts,Rate previosRate) {
                if(rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO)>0){
                BigDecimal referenceAmount = calculateResidualAmount(rateAmounts,previosRate.getMortgageResidual().getAmount());
                BigDecimal referenceDuration = previosRate.getMortgageResidual().getDuration().subtract(BigDecimal.ONE);
                new MortgageReference(referenceAmount,referenceDuration);
                }
                return new  MortgageReference(previosRate.getMortgageReference().getReferenceAmount(),previosRate.getMortgageReference().getReferenceDuration());
        }
        private static BigDecimal calculateResidualAmount(RateAmounts rateAmounts, BigDecimal amount) {
                return amount
                        .subtract(rateAmounts.getCapitalAmount())
                        .subtract(rateAmounts.getOverpayment().getAmount())
                        .max(BigDecimal.ZERO);
        }
}
