package java_oop.enum_exc2;

import java_oop.enum_exc1.Day;

import java.util.Arrays;

public enum Dance1 {
        SALSA("13.00-15.00", new Day[]{Day.MONDAY, Day.SATURDAY}) {
                @Override
                public Dance1 getalternative() {
                        return WALTZ;
                }
        },

        ROCKANDROLL("13.00-15.00", new Day[]{Day.MONDAY, Day.THURSDAY}) {
                @Override
                public Dance1 getalternative() {
                        return WALTZ;
                }
        },
        RUMBA("13.00-15.00", new Day[]{Day.MONDAY, Day.SATURDAY, Day.WEDNESDAY}) {
                @Override
                public Dance1 getalternative() {
                        return WALTZ;
                }
        },
        ZUMBA("13.00-15.00", new Day[]{Day.FRIDAY, Day.SATURDAY}) {
                @Override
                public Dance1 getalternative() {
                        return WALTZ;
                }
        },
        WALTZ("13.00-15.00", new Day[]{Day.MONDAY, Day.SATURDAY}) {
                @Override
                public Dance1 getalternative() {
                        return WALTZ;
                }
        };

        private final String hours;


        public abstract Dance1 getalternative();

        public String getHours() {
                return hours;
        }

        public String getDays() {
                return Arrays.toString(days);
        }

        final Day[] days;

        Dance1(String hours, Day[] days) {
                this.days = days;
                this.hours = hours;

        }
}
