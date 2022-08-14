package java_oop.enum_exc1;

public class Main {
        public static void main(String[] args) {
//                Day[] day = Day.values();
                String mon = "MONDAY";
                System.out.println(Day.valueOf(mon));
                for (Day day : Day.values()) {
                        System.out.println(day.day);
                        System.out.println(day);
                        System.out.println(day.isWorkingDay());
                        System.out.println(day.isWeekend());
                }

                method2();
        }

        private static void method2() {
                for (Day2 day : Day2.values()) {
                        System.out.println(day);
                        System.out.println(day.getDayshort());
                        System.out.println("is working: "+day.isWorkingDay());
                        System.out.println("is weekend: "+day.isWeekend());
                }
        }
}
