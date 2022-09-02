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
        public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
                MortgageResidual residual = previousRate.getMortgageResidual();

                BigDecimal residualAmount = calculateResidualAmount(rateAmounts,residual.getAmount()) ;
                BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

                return new MortgageResidual(residualAmount,residualDuration);
        }
        private static BigDecimal calculateResidualAmount(RateAmounts rateAmounts, BigDecimal amount) {
                return amount
                        .subtract(rateAmounts.getCapitalAmount())
                        .subtract(rateAmounts.getOverpayment().getAmount())
                        .max(BigDecimal.ZERO);
        }
}
