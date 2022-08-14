package java_oop.enum_exc1;
/**Stwórz enum Day, który bêdzie zawiera³ dni tygodnia i metody boolean isWorkingDay() oraz boolean
isWeekend(). Stwórz równie¿ interface WorkingDay, który bêdzie zawiera³ metodê boolean
isWorkingDay() oraz interfejs Weekend, zawieraj¹cy metodê boolean isWeekend().
        Zaimplementuj ten interfejs przy wykorzystaniu enuma Day. Zapewnij, aby ka¿da wartoœæ enuma,
        mia³a podan¹ nazwê skrócon¹ jako swój parametr, czyli MONDAY(MON), TUESDAY(TUE) itp. Zainicjalizuj
enum MONDAY na podstawie wartoœci String.
        W pêtli wypisz wszystkie wartoœci enuma na ekranie oraz przy ka¿dej z nich wydrukuj czy jest to
        dzieñ pracuj¹cy czy nie*/

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
