package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Rate;

import java.util.List;

public interface RateCalculationService {
        List<Rate> calculate(final InputData inputData);
}
