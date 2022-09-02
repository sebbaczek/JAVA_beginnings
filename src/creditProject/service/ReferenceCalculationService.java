package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageReference;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

public interface ReferenceCalculationService {
        MortgageReference calculate(InputData inputData);

//        MortgageReference calculate(InputData inputData, Rate previousRate);

        MortgageReference calculate(InputData inputData, RateAmounts rateAmounts, Rate previousRate);
}
