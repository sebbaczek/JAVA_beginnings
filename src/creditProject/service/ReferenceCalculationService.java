package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageReference;

public interface ReferenceCalculationService {
        MortgageReference calculate(InputData inputData);

}
