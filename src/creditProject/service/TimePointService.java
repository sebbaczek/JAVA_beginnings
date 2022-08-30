package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.TimePoint;

import java.math.BigDecimal;

public interface TimePointService {

        TimePoint calculate(BigDecimal rateNumber, InputData inputData);
}
