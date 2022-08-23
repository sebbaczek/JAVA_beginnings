package date_time.exc5;

import java.time.LocalDate;
import java.time.Period;

/**Oblicz okres miêdzy dwiema datami, spróbuj je wyraziæ jako Period*/
public class Main {
        public static void main(String[] args) {
                LocalDate localDate1 = LocalDate.of(2012,6,24);
                LocalDate localDate2 = LocalDate.of(1012,12,23);
                Period period = Period.between(localDate1,localDate2);
                System.out.println(period);
                System.out.println(Period.between(localDate2,localDate1));
        }
}
