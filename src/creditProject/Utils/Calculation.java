package creditProject.Utils;



import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculation {
        private Calculation() {
        }
public static final BigDecimal YEAR = BigDecimal.valueOf(12);


        public static BigDecimal calculateInterestAmount(BigDecimal residualAmount, BigDecimal interestPercent) {
                return residualAmount.multiply(interestPercent).divide(YEAR, 20, RoundingMode.HALF_UP);

        }
}
