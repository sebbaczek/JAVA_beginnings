package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;

import java.math.BigDecimal;

public interface OverpaymentCalculationService {
        Overpayment calculate(BigDecimal rateNumber, InputData inputData);
}
