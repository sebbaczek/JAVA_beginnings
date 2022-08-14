package java_oop.enum_exc1;
/**Stw�rz enum Day, kt�ry b�dzie zawiera� dni tygodnia i metody boolean isWorkingDay() oraz boolean
isWeekend(). Stw�rz r�wnie� interface WorkingDay, kt�ry b�dzie zawiera� metod� boolean
isWorkingDay() oraz interfejs Weekend, zawieraj�cy metod� boolean isWeekend().
        Zaimplementuj ten interfejs przy wykorzystaniu enuma Day. Zapewnij, aby ka�da warto�� enuma,
        mia�a podan� nazw� skr�con� jako sw�j parametr, czyli MONDAY(MON), TUESDAY(TUE) itp. Zainicjalizuj
enum MONDAY na podstawie warto�ci String.
        W p�tli wypisz wszystkie warto�ci enuma na ekranie oraz przy ka�dej z nich wydrukuj czy jest to
        dzie� pracuj�cy czy nie*/

public enum Day implements Weekend, WorkingDay {

        MONDAY("MON") {
                @Override
                public boolean isWeekend() {
                        return false;
                }

                @Override
                public boolean isWorkingDay() {
                        return true;
                }
        },
        TUESDAY("TUE"){
                @Override public boolean isWeekend(){
                        return false;
                }
                @Override public boolean isWorkingDay(){
                        return true;
                }
        },
        WEDNESDAY("WED"){
                @Override public boolean isWeekend(){
                        return false;
                }
                @Override public boolean isWorkingDay(){
                        return true;
                }
        },
        THURSDAY("THU"){
                @Override public boolean isWeekend(){
                        return false;
                }
                @Override public boolean isWorkingDay(){
                        return true;
                }
        },
        FRIDAY("FRI"){
                @Override public boolean isWeekend(){
                        return false;
                }
                @Override public boolean isWorkingDay(){
                        return true;
                }
        },
        SATURDAY("SAT"){
                @Override public boolean isWeekend(){
                        return true;
                }
                @Override public boolean isWorkingDay(){
                        return false;
                }
        },
        SUNDAY("SUN"){
                @Override public boolean isWeekend(){
                        return true;
                }
                @Override public boolean isWorkingDay(){
                        return false;
                }
        };
//        private static String MON;
        public final String day;

        Day(String day) {
        this.day = day;
        }

//        @Override
//        public boolean isWeekend() {
//                return false;
//        }
//
//        @Override
//        public boolean isWorkingDay() {
//                return false;
//        }
}
