package creditProject.Model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Overpayment {
        public static final String REDUCE_RATE = "REDUCE_RATE";
        public static final String REDUCE_PERIOD = "REDUCE_PERIOD ";
        private final BigDecimal amount;
        private final BigDecimal provisonAmount;

        public Overpayment(BigDecimal amount, BigDecimal provisonAmount) {
                this.amount = amount;
                this.provisonAmount = provisonAmount;
        }

        public BigDecimal getAmount() {
                return amount.setScale(2, RoundingMode.HALF_UP);
        }

        public BigDecimal getProvisonAmount() {
                return provisonAmount.setScale(2, RoundingMode.HALF_UP);
        }
}
