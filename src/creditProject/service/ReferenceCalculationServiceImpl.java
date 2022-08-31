package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.MortgageReference;

public class ReferenceCalculationServiceImpl implements ReferenceCalculationService{


        @Override
        public MortgageReference calculate(InputData inputData) {
                return new  MortgageReference(inputData.getAmount(),inputData.getMonthsDuration());
        }
}
