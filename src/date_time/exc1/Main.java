package date_time.exc1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

/**Przedstaw OffsetDateTime na ekranie w 4 ró¿nych formatach*/
public class Main {
        public static void main(String[] args) {
                OffsetDateTime datetime = OffsetDateTime.of(2000,12,12,5,32,32,0, ZoneOffset.UTC);
                System.out.println(datetime);
                OffsetDateTime datetime1 = OffsetDateTime.of(LocalDate.now(), LocalTime.now(),ZoneOffset.ofHours(4));
                System.out.println(datetime1);
                OffsetDateTime datetime2 = OffsetDateTime.now(ZoneId.of(ZoneId.systemDefault().getId()));
                System.out.println(datetime2);

                LocalDate localDate = LocalDate.of(2000,2,13);
                LocalTime localTime = LocalTime.of(3,45);
                OffsetDateTime offsetDateTime2= OffsetDateTime.of(localDate,localTime, ZoneOffset.UTC);
                System.out.println(offsetDateTime2);

                System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(offsetDateTime2));
                System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(offsetDateTime2));
                System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(offsetDateTime2));
                System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(offsetDateTime2));

                System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(offsetDateTime2));
                System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(offsetDateTime2));





        }
}
