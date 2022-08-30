package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

public interface AmountsCalculationService {
        RateAmounts calculate(InputData inputData);

        RateAmounts calculate(InputData inputData, Rate previousRate);
}
