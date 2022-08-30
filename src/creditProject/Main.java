package creditProject;

import creditProject.Model.InputData;
import creditProject.service.*;

import java.math.BigDecimal;

public class Main {
        public static void main(String[] args) {

                  InputData inputData = new InputData()
                        .withAmount(new BigDecimal("290000"))
                        .withMonthsDuration(BigDecimal.valueOf(160));

//                PrintingService printingService = new PrintingserviceImpl();
//                printingService.PrintInputDataInfo(inputData);
                PrintingService printingService = new PrintingserviceImpl();
              RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                      new TimePointServiceImpl(),
                      new AmountsCalculationServiceImp(),
                      new ResidualCalculationServiceImpl()
              );

                MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(printingService,rateCalculationService);
        mortgageCalculationService.calculate(inputData);





        }
}
