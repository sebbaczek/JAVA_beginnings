package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Rate;

import java.util.List;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

        private final PrintingService printingService;
        private final RateCalculationService rateCalculationService;

        public MortgageCalculationServiceImpl(PrintingService printingService, RateCalculationService rateCalculationService) {
                this.printingService = printingService;
                this.rateCalculationService = rateCalculationService;
        }

        @Override
        public void calculate(InputData inputData) {

                printingService.PrintInputDataInfo(inputData);
                List<Rate> calculate = rateCalculationService.calculate(inputData);
        }
}
