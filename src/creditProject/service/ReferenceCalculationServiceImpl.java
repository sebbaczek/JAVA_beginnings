package creditProject.service;

import creditProject.Model.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.log;

public class ReferenceCalculationServiceImpl implements ReferenceCalculationService {

        private static final BigDecimal YEAR = BigDecimal.valueOf(12);
        private static BigDecimal calculateResidualAmount(RateAmounts rateAmounts, BigDecimal amount) {
                return amount
                        .subtract(rateAmounts.getCapitalAmount())
                        .subtract(rateAmounts.getOverpayment().getAmount())
                        .max(BigDecimal.ZERO);
        }

        @Override
        public MortgageReference calculate(InputData inputData) {
                return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
        }

        @Override
        public MortgageReference calculate(InputData inputData, RateAmounts rateAmounts, Rate previousRate) {
                if (BigDecimal.ZERO.equals(previousRate.getMortgageResidual().getAmount())) {
                        return new MortgageReference(BigDecimal.ZERO, BigDecimal.ZERO);
                }
                switch (inputData.getOverpaymentReduceWay()) {
                        case Overpayment.REDUCE_PERIOD:
//                                return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
                                return reducePeriodMortgageReference(inputData, rateAmounts, previousRate);

                        case Overpayment.REDUCE_RATE:
                                return reduceRateMortgageReference(rateAmounts, previousRate);
                        default:
                                throw new MortgageException();
                }


        }

        private MortgageReference reducePeriodMortgageReference(InputData inputData, RateAmounts rateAmounts, Rate previousRate) {
                if (rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO) > 0) {
                    BigDecimal referenceAmount = calculateResidualAmount(rateAmounts, previousRate.getMortgageResidual().getAmount());
//                BigDecimal referenceAmount2 = referenceAmount;
//                        BigDecimal referenceDuration = previousRate.getMortgageResidual().getDuration().subtract(BigDecimal.ONE);
                        BigDecimal previousDuration = previousRate.getMortgageResidual().getDuration();
                        BigDecimal residualDuration = calculateResidualDuration(rateAmounts.getRateAmount(),
                                previousDuration, referenceAmount,inputData.getInterestPercent()).setScale(0,
                                RoundingMode.HALF_UP);
//                        BigDecimal residualDuration2=previousRate.getMortgageReference().getDuration();
//                        inputData.withMonthsDuration(residualDuration);
//                        return new MortgageReference(inputData.getAmount(), residualDuration);

//                if (rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO) > 0) {
//                        residualDuration2 = residualDuration;
//                        previousDuration = residualDuration;
                        return new MortgageReference(referenceAmount, residualDuration);
                }
//                return new MortgageReference(referenceAmount, residualDuration2.subtract(BigDecimal.valueOf(1)));
                return new MortgageReference(inputData.getAmount(), inputData.getMonthsDuration());
//                return new MortgageReference(inputData.getAmount(), previousRate.getMortgageReference().getDuration());
        }

        private BigDecimal calculateResidualDuration(BigDecimal amount, BigDecimal previousDuration, BigDecimal referenceAmount, BigDecimal interestPercent) {
                BigDecimal mianownikLicznika = amount.subtract(
                        referenceAmount
                                .multiply(interestPercent
                                        .divide(YEAR))
                ).setScale(5, RoundingMode.HALF_UP);
                double licznik= amount.divide(mianownikLicznika,5, RoundingMode.HALF_UP).doubleValue();
                double logLlicznika = log(
                        licznik
                );
                double mianownik = log(
                        BigDecimal.ONE
                                .add(interestPercent
                                        .divide(YEAR,5, RoundingMode.HALF_UP)).doubleValue()
                );
                BigDecimal residualDuration =
                        BigDecimal.valueOf(logLlicznika)
                                                       .divide(BigDecimal.valueOf(mianownik),5,
                                                               RoundingMode.HALF_UP);

                return residualDuration;
        }


        private MortgageReference reduceRateMortgageReference(RateAmounts rateAmounts, Rate previousRate) {
                if (rateAmounts.getOverpayment().getAmount().compareTo(BigDecimal.ZERO) > 0) {
                        BigDecimal referenceAmount = calculateResidualAmount(rateAmounts, previousRate.getMortgageResidual().getAmount());
                        BigDecimal referenceDuration = previousRate.getMortgageResidual().getDuration().subtract(BigDecimal.ONE);
                        return new MortgageReference(referenceAmount, referenceDuration);
                }
                return new MortgageReference(previousRate.getMortgageReference().getAmount(), previousRate.getMortgageReference().getDuration());
        }
}
