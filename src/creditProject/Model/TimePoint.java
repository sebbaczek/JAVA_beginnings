package creditProject.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TimePoint {
        private final LocalDate localDate;
        private final BigDecimal year;
        private final BigDecimal month;

        public TimePoint(LocalDate localDate, BigDecimal year, BigDecimal month) {
                this.localDate = localDate;
                this.year = year;
                this.month = month;
        }

        public LocalDate getLocalDate() {
                return localDate;
        }

        public BigDecimal getYear() {
                return year;
        }

        public BigDecimal getMonth() {
                return month;
        }
}
