package creditProject;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.RateType;
import creditProject.service.*;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Map;

public class Main {
        public static void main(String[] args) {

                  InputData inputData = new InputData()
                        .withAmount(new BigDecimal("300000"))
                          .withOverpaymentSchema(Map.of(
                                  4,BigDecimal.valueOf(10000),
                                  8,BigDecimal.valueOf(10000),
                                  15,BigDecimal.valueOf(10000),
                                  28,BigDecimal.valueOf(10000)
                          ))
//                          .withOverpaymentSchema(Collections.emptyMap())
                        .withMonthsDuration(BigDecimal.valueOf(360))
                        .withRateType(RateType.DECREASING)
                        .withOverpaymentReduceWay(Overpayment.REDUCE_PERIOD);

//                PrintingService printingService = new PrintingserviceImpl();
//                printingService.PrintInputDataInfo(inputData);
                PrintingService printingService = new PrintingServiceImpl();
              RateCalculationService rateCalculationService = new RateCalculationServiceImpl(
                      new TimePointServiceImpl(),
                      new AmountsCalculationServiceImp(
                              new ConstantAmountsCalculationServiceImpl(),
                              new DecreasingAmountsCalculationServiceImpl()
                      ),
                      new OverpaymentCalculationServiceImpl(),
                      new ResidualCalculationServiceImpl(),
                      new ReferenceCalculationServiceImpl()
              );

                MortgageCalculationService mortgageCalculationService = new MortgageCalculationServiceImpl(
                        printingService,
                        rateCalculationService,
                        SummaryServiceFactory.create()
                );
        mortgageCalculationService.calculate(inputData);





        }
}
