package date_time.exc3;

import java.time.LocalDate;

/**Na podstawie podanej daty 24.06.2012 wydrukuj na ekranie nazwê miesi¹ca s³ownie*/
public class Main {
        public static void main(String[] args) {
                LocalDate localDate = LocalDate.of(2012,6,24);
                System.out.println(localDate.getMonth());
        }
}
