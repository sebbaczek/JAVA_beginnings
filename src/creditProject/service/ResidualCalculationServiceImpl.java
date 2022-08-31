package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageResidual;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationServiceImpl implements ResidualCalculationService {
        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
                BigDecimal residualAmount = calculateResidualAmount(inputData.getAmount(), rateAmounts);
                BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);
                return new MortgageResidual(residualAmount,residualDuration);
        }

        private static BigDecimal calculateResidualAmount(BigDecimal inputData, RateAmounts rateAmounts) {
                return inputData
                        .subtract(rateAmounts.getCapitalAmount())
                        .subtract(rateAmounts.getOverpayment().getAmount())
                        .max(BigDecimal.ZERO);
        }

        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
                MortgageResidual residual = previousRate.getMortgageResidual();

                BigDecimal residualAmount = calculateResidualAmount(residual.getAmount(), rateAmounts);
                BigDecimal residualDuration = residual.getDuration().subtract(BigDecimal.ONE);

                return new MortgageResidual(residualAmount,residualDuration);
        }
}
