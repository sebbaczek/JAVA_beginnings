package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

public interface ConstantAmountsCalculationService {

        RateAmounts calculate(InputData inputData, Overpayment overpayment);

        RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);
}
