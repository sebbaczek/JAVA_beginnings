package date_time.exc2;

import java.time.LocalDate;

/** Jaki mamy dzieñ tygodnia dla podanej daty: 06.05.2018?*/
public class Main {
        public static void main(String[] args) {
                LocalDate date = LocalDate.of(2018,06,06);
                String day = String.valueOf(date.getDayOfWeek());
                Enum day2 = date.getDayOfWeek();
                System.out.println(day);
                System.out.println(day2);
        }
}
