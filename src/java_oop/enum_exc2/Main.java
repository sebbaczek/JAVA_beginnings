package java_oop.enum_exc2;

import java.util.Arrays;

/**Stwórz enum, który bêdzie reprezentowa³ mo¿liwe rodzaje tañca (przyk³adowo 5) dostêpne w szkole
        tañca. Ka¿dy z tañców ma mieæ tablicê z godzinami (stwórz godzinê jako String), o której zajêcia z
        danego rodzaju tañca s¹ realizowane oraz tablicê z dniami w które zajêcia siê odbywaj¹
        (wykorzystaj enuma z poprzedniego zadania). Dodaj równie¿ alternatywny rodzaj tañca jaki mo¿e
        byæ uczony, je¿eli nauczyciel nie dotrze na czas na zajêcia. Wypisz na ekranie dowolne 2 z nich,
        wypisz mo¿liwe godziny, mo¿liwe dni tygodnia oraz zajêcia alternatywne, je¿eli nauczyciel nie
        dotrze na zajêcia. Przyk³adowy zapis do wydrukowania na ekranie:*/

public class Main {
        public static void main(String[] args) {
                for (Dance dance : Dance.values()) {
                        System.out.println(dance.name()+": hours: "+dance.hours+", days: "+ Arrays.toString(dance.days)+", alternative: "+dance.alternative);
                }

                /**method2*/
               Dance1 salsa = Dance1.SALSA;
                System.out.println();
                System.out.println(salsa.name()+": hours: "+salsa.getHours()+", days: "+ salsa.getDays()+", alternative: "+salsa.getalternative());

        }
}
