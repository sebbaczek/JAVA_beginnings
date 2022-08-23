package date_time.exc4;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**Ile czasu minê³o od Epoch do dziœ*/
public class Main {
        public static void main(String[] args) {
                LocalDate localDate = LocalDate.now();
                LocalTime localTime = LocalTime.now();
                System.out.println(localDate.toEpochSecond(localTime, ZoneOffset.UTC));
                long time2 = localDate.toEpochSecond(localTime, ZoneOffset.UTC);
                System.out.println(LocalDateTime.ofEpochSecond(time2,0,ZoneOffset.UTC));
                Duration chronoUnit = Duration.of(time2,ChronoUnit.SECONDS);
                System.out.println(chronoUnit.toDays());

//method2
                Duration duration = Duration.of(Instant.now().getEpochSecond(),ChronoUnit.SECONDS);
                System.out.println("method2: "+duration.toString());
                System.out.println(Period.ofDays((int)(duration.toDays())));




        }
}
