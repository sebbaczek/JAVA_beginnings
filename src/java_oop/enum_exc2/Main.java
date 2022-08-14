package java_oop.enum_exc2;

import java.util.Arrays;

/**Stw�rz enum, kt�ry b�dzie reprezentowa� mo�liwe rodzaje ta�ca (przyk�adowo 5) dost�pne w szkole
        ta�ca. Ka�dy z ta�c�w ma mie� tablic� z godzinami (stw�rz godzin� jako String), o kt�rej zaj�cia z
        danego rodzaju ta�ca s� realizowane oraz tablic� z dniami w kt�re zaj�cia si� odbywaj�
        (wykorzystaj enuma z poprzedniego zadania). Dodaj r�wnie� alternatywny rodzaj ta�ca jaki mo�e
        by� uczony, je�eli nauczyciel nie dotrze na czas na zaj�cia. Wypisz na ekranie dowolne 2 z nich,
        wypisz mo�liwe godziny, mo�liwe dni tygodnia oraz zaj�cia alternatywne, je�eli nauczyciel nie
        dotrze na zaj�cia. Przyk�adowy zapis do wydrukowania na ekranie:*/

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
