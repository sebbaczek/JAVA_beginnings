package creditProject.Model;

import java.math.BigDecimal;

public class RateAmounts {
        private final BigDecimal rateAmount;
        private final BigDecimal interestAmount;
        private final BigDecimal capitalAmount;

        public BigDecimal getRateAmount() {
                return rateAmount;
        }

        public BigDecimal getInterestAmount() {
                return interestAmount;
        }

        public BigDecimal getCapitalAmount() {
                return capitalAmount;
        }

        public RateAmounts(BigDecimal rateAmount, BigDecimal interestAmount, BigDecimal capitalAmount) {
                this.rateAmount = rateAmount;
                this.interestAmount = interestAmount;
                this.capitalAmount = capitalAmount;
        }
}
