package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageResidual;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

public interface ResidualCalculationService {
        MortgageResidual calculate(RateAmounts rateAmounts, InputData inputData);
//        MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate);

        MortgageResidual calculate(RateAmounts rateAmounts, Rate previousRate, InputData inputData);
}
