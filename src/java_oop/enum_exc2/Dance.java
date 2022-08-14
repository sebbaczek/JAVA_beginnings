package java_oop.enum_exc2;

import java_oop.enum_exc1.Day;

public enum Dance {
        SALSA("13.00-15.00", new Day[]{Day.MONDAY, Day.SATURDAY}, "ZUMBA"),
        ROCKANDROLL("13.00-15.00",new Day[]{Day.MONDAY, Day.THURSDAY}, "SALSA"),
        RUMBA("13.00-15.00",new Day[]{Day.MONDAY, Day.SATURDAY,Day.WEDNESDAY}, "WALTZ"),
        ZUMBA("13.00-15.00", new Day[]{Day.FRIDAY, Day.SATURDAY}, "RUMBA"),
        WALTZ("13.00-15.00", new Day[]{Day.MONDAY, Day.SATURDAY}, "ROCKANDROLL");

        public final String hours;
//        public final String alternative;

//        public final String days;
public final String alternative;
        final Day[] days;

        Dance(String hours, Day[] days, String alternative) {
                this.days = days;
                this.hours = hours;
                this.alternative = alternative;

        }
}
