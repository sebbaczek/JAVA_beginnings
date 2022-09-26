package creditProject.service;

import creditProject.Model.Rate;
import creditProject.Model.Summary;

import java.math.BigDecimal;
import java.util.List;

public class SummaryServiceFactory {

        public static SummaryService create() {
                return rates -> {
                        BigDecimal interestSum = calculate(rates, rate -> rate.getRateAmounts().getInterestAmount());
                        BigDecimal provisions = calculate(rates, rate -> rate.getRateAmounts().getOverpayment().getProvisionAmount());
                        BigDecimal totalLosts = interestSum.add(provisions);
                        return new Summary(interestSum, provisions, totalLosts);
                };
        }

        private static BigDecimal calculate(List<Rate> rates, Function function) {
                BigDecimal sum = BigDecimal.ZERO;
                for (Rate rate : rates) {
//                        sum=sum.add(rate.getRateAmounts().getInterestAmount());
                        sum = sum.add(function.calculate(rate));
                }
                return sum;
        }
}
//        private static BigDecimal calculateProvisionsSum(List<Rate> rates){
//                BigDecimal sum =BigDecimal.ZERO;
//                for (Rate rate : rates) {
//                        sum=sum.add(rate.getRateAmounts().getOverpayment().getProvisonAmount());
//
//                }
//                return sum;
//}
