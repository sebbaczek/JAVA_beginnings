package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.Overpayment;
import creditProject.Model.Rate;
import creditProject.Model.RateAmounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountsCalculationServiceImp implements AmountsCalculationService {

private final ConstantAmountsCalculationService constantAmountsCalculationService;
private final DecreasingAmountsCalculationService decreasingAmountsCalculationService;

        public AmountsCalculationServiceImp(ConstantAmountsCalculationService constantAmountsCalculationService, DecreasingAmountsCalculationService decreasingAmountsCalculationService) {
                this.constantAmountsCalculationService = constantAmountsCalculationService;
                this.decreasingAmountsCalculationService = decreasingAmountsCalculationService;
        }

        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment) {
                switch (inputData.getRateType()) {
                        case CONSTANT:
                                return constantAmountsCalculationService.calculate(inputData,overpayment);
                        case DECREASING:
                                return decreasingAmountsCalculationService.calculate(inputData,overpayment);
                        default:
                        throw new MortgageException();
                }

        }


        @Override
        public RateAmounts calculate(InputData inputData, Overpayment overpayment, Rate previousRate) {
                switch (inputData.getRateType()) {
                        case CONSTANT:
                                return constantAmountsCalculationService.calculate(inputData,overpayment, previousRate);
                        case DECREASING:
                                return decreasingAmountsCalculationService.calculate(inputData,overpayment, previousRate);
                        default:throw new MortgageException();

                }
        }





}
