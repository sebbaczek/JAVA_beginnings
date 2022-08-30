package creditProject.service;

import creditProject.Model.InputData;
import creditProject.Model.TimePoint;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TimePointServiceImpl implements TimePointService {
        private static final BigDecimal YEAR = BigDecimal.valueOf(12);

        private static LocalDate calculateDate(BigDecimal rateNumber, InputData inputData) {
                return inputData.getRepaymentStartDate().plus(rateNumber.subtract(BigDecimal.ONE).intValue(), ChronoUnit.MONTHS);
        }

        @Override
        public TimePoint calculate(BigDecimal rateNumber, InputData inputData) {

                LocalDate date = calculateDate(rateNumber, inputData);
                BigDecimal year = calculateYear(rateNumber);
                BigDecimal month = calculateMonth(rateNumber);

//                return null;
                return new TimePoint(date, year, month);
        }

        private BigDecimal calculateYear(final BigDecimal rateNumber) {
                return rateNumber.divide(YEAR, RoundingMode.UP).max(BigDecimal.ONE);
        }

        private BigDecimal calculateMonth(final BigDecimal rateNumber) {
                return BigDecimal.ZERO.equals(rateNumber.remainder(YEAR)) ? YEAR : rateNumber.remainder(YEAR);
        }
}
