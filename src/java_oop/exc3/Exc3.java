package java_oop.exc3;

import java.util.Arrays;

/**Napisz klasê Square reprezentuj¹cej kwadrat, w której zawrzesz 2 konstruktory, jeden domyœlny, gdzie bok kwadratu bêdzie wynosi³ 5. Drugi, w którym u¿ytkownik mo¿e okreœliæ tê wartoœæ. Do tego dodaj getter oraz setter. Pamiêtaj o enkapsulacji. Dodaj metodê licz¹c¹ obwód i metodê licz¹c¹ pole kwadratu. Nadpisz metodê equals(). Nadpisz metodê toString(). U¿yj nastêpnie tej klasy, aby stworzyæ kilka kwadratów o ró¿nych bokach i umieœciæ je w tablicy. dodaj pare zduplikowanych kwadratów. Nastêpnie wykorzystuj¹c algorytm do usuwania duplikatów, który zosta³ napisany w zadaniach z tablicami, usuñ zduplikowane kwadraty z tablicy. (Algorytm zak³ada³ sortowanie elementów, za³ó¿ zatem, ¿e porównanie kwadratów, który jest wiêkszy, a który mniejszy nast¹pi po jego polu powierzchni).*/

public class Exc3 {
        public static void main(String[] args) {
                Square[] table = new Square[20];
                for (int i = 0; i < 20; i++) {
                        table[i] = (i+3)*7%3 == 0 ?
                                new Square(i+3):i>10 ?
                                new Square(i-2):new Square(10);
                }
                for (Square square : table) {
                        System.out.println(square.getSide());
                }
                System.out.println(Arrays.toString(table));
                Square[][] wynik = searchind(table);
                /**duplikaty*/
                System.out.println(Arrays.toString(wynik[0]));
                /**unikaty*/
                System.out.println(Arrays.toString(wynik[1]));

        }


        private static Square[][] searchind(Square[] arr) {
                final Square[] dupl = new Square[arr.length / 2];
                final Square[] dupl2 = new Square[arr.length];
                int duplcounter = 0, duplindex = 0;
                int duplcounter2 = 0, duplindex2 = 0;
                Square elem;

/**pêtla wywo³uj¹ca 2 metody*/

                for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                        /**metoda sprawdzaj¹ca czy dany element jest ju¿ duplikatem w dupl[]*/
                        if (ifisinduplarray(arr[i], dupl, duplcounter)) {
//                                i++;
                                continue;
                        }

                        elem = arr[i];
                        /**metoda sprawdzaj¹ca czy dany element jest w ogóle duplikatem*/
                        if (ifduplicate(elem, arr)) {
                                dupl[duplindex] = arr[i];
                                duplcounter++;
                                duplindex++;
                        } else{
                                /**unikaty*/
                                dupl2[duplindex2] = arr[i];
//                                System.out.println(arr[i]);
                                duplcounter2++;
                                duplindex2++;
                        }
                }
                /**metoda skracaj¹ca tablicê o niepotrzebne zera na koñcu, rozmiar nowej tablicy jest zliczany wraz z zapisem duplikatów*/
                Square[] extable = new Square[duplcounter];
                for (int i = 0; i < duplcounter; i++) {
                        extable[i] = dupl[i];
                }
                Square[] extable2 = new Square[duplcounter2];
                for (int i = 0; i < duplcounter2; i++) {
                        extable2[i] = dupl2[i];
                }
                Square [][] res = {extable, extable2};
                return res;
        }


        private static boolean ifisinduplarray(Square elem1, Square[] dupl, int duplcounter) {

                for (int i = 0; i < duplcounter; i++) {
                        if (dupl[i].area(dupl[i].getSide()) == elem1.area(elem1.getSide())) {
                                return true;
                        }
                }
                return false;
        }

        private static boolean ifduplicate(Square elem2, Square... args) {

                int counter = 0;

                Square[] table = args;

                for (Square ind2 : table) {
                        if (elem2.area(elem2.getSide()) == ind2.area(ind2.getSide())) {
/**counter ma byæ co najmniej 2 aby nie przypisaæ do dupl[] elementu który rozpatrujemy*/
                                counter++;
                                if (counter >= 2) {
                                        return true;
                                }
                        }
                }

                return false;
        }
}
