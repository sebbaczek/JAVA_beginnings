package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageResidual;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;

public class ResidualCalculationServiceImpl implements ResidualCalculationService {
        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData) {
                BigDecimal residualAmount = inputData.getAmount().subtract(rateAmounts.getCapitalAmount());
                BigDecimal residualDuration = inputData.getMonthsDuration().subtract(BigDecimal.ONE);
                return new MortgageResidual(residualAmount,residualDuration);
        }

        @Override
        public MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate) {
                BigDecimal residualAmount = previousRate.getMortgageResidual().getAmount().subtract(BigDecimal.ONE);
                BigDecimal previousDuration = previousRate.getMortgageResidual().getDuration();
                BigDecimal residualDuration = previousDuration.subtract(BigDecimal.ONE);
                return new MortgageResidual(residualAmount,residualDuration);
        }
}
