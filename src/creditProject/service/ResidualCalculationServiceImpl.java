package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageResidual;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationServiceImpl implements ResidualCalculationService {
        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
                BigDecimal residualAmount = calculateResidualAmount(rateAmounts,inputData.getAmount() );
                BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);
                return new MortgageResidual(residualAmount,residualDuration);
        }



        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate, InputData inputData) {
                MortgageResidual residual = previousRate.getMortgageResidual();

                BigDecimal residualAmount = calculateResidualAmount(rateAmounts,residual.getAmount()) ;
//                BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);
//                BigDecimal residualDuration = previousRate.getMortgageReference().getDuration().subtract(BigDecimal.ONE);

                BigDecimal residualDuration =
//                        previousRate.getRateAmounts().getOverpayment().getAmount().compareTo(BigDecimal.ZERO)>0&&inputData.getOverpaymentReduceWay().equals("REDUCE_PERIOD")&&inputData.getRateType().equals("CONSTANT")?
                                previousRate.getRateAmounts().getOverpayment().getAmount().compareTo(BigDecimal.ZERO)>0&&inputData.getOverpaymentReduceWay().equals("REDUCE_PERIOD")?
//                        rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO)>0?
                                previousRate.getMortgageReference().getDuration():
                                previousRate.getMortgageResidual().getDuration().subtract(BigDecimal.ONE);

//                                inputData.getMonthsDuration().subtract(BigDecimal.ONE);
//                                residual.getDuration().subtract(BigDecimal.ONE);

                return new MortgageResidual(residualAmount,residualDuration);
        }
        private static BigDecimal calculateResidualAmount(RateAmounts rateAmounts, BigDecimal amount) {
                return amount
                        .subtract(rateAmounts.getCapitalAmount())
                        .subtract(rateAmounts.getOverpayment().getAmount())
                        .max(BigDecimal.ZERO);
        }
}
