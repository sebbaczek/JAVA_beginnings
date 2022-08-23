package date_time.exc6;

import java.time.*;

/** Która godzina jest w Nowym Jorku, je¿eli w Warszawie jest 02.10.2016 12:05:10.*/
public class Main {
        public static void main(String[] args) {
                LocalDateTime localDateTime = LocalDateTime.of(2016,10,2,12,05,10);
//                System.out.println(localDateTime.atZone(ZoneId.of("Europe/Warsaw")));
                ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, (ZoneId.of("Europe/Warsaw")));
                System.out.println(zonedDateTime);
//                OffsetDateTime offsetDateTime= localDateTime.atZone(ZoneId.of("Europe/Warsaw")).toOffsetDateTime();
//                System.out.println(offsetDateTime);
//                OffsetDateTime offsetDateTime2 = localDateTime.atZone(ZoneId.of("America/New_York")).toOffsetDateTime();
                ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
//               OffsetDateTime offsetDateTime = ZonedDateTime.

                System.out.println(zonedDateTime1);
//                OffsetDateTime offsetDateTime = OffsetDateTime.of()

        }
}
