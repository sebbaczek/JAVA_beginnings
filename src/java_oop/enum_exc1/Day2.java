package java_oop.enum_exc1;


public enum Day2 implements Weekend, WorkingDay {

        MONDAY("MON",true),
        TUESDAY("TUE",true),
        WEDNESDAY("WED",true),
        THURSDAY("THU",true),
        FRIDAY("FRI",true),
        SATURDAY("SAT",false),
        SUNDAY("SUN",false);



        private final String dayshort;

        public String getDayshort() {
                return dayshort;
        }
        private final boolean isworking;

        Day2(String dayshort, boolean isworking) {
        this.dayshort = dayshort;
        this.isworking = isworking;
        }

        @Override
        public boolean isWeekend() {
                return !isworking;
        }

        @Override
        public boolean isWorkingDay() {
                return isworking;
        }

}
