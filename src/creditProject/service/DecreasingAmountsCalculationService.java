package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;

public interface DecreasingAmountsCalculationService {

        RateAmounts calculate(InputData inputData, Overpayment overpayment);

        RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate);


}
