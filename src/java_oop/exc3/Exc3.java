package java_oop.exc3;

import java.util.Arrays;

/**Napisz klas� Square reprezentuj�cej kwadrat, w kt�rej zawrzesz 2 konstruktory, jeden domy�lny, gdzie bok kwadratu b�dzie wynosi� 5. Drugi, w kt�rym u�ytkownik mo�e okre�li� t� warto��. Do tego dodaj getter oraz setter. Pami�taj o enkapsulacji. Dodaj metod� licz�c� obw�d i metod� licz�c� pole kwadratu. Nadpisz metod� equals(). Nadpisz metod� toString(). U�yj nast�pnie tej klasy, aby stworzy� kilka kwadrat�w o r�nych bokach i umie�ci� je w tablicy. dodaj pare zduplikowanych kwadrat�w. Nast�pnie wykorzystuj�c algorytm do usuwania duplikat�w, kt�ry zosta� napisany w zadaniach z tablicami, usu� zduplikowane kwadraty z tablicy. (Algorytm zak�ada� sortowanie element�w, za�� zatem, �e por�wnanie kwadrat�w, kt�ry jest wi�kszy, a kt�ry mniejszy nast�pi po jego polu powierzchni).*/

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

/**p�tla wywo�uj�ca 2 metody*/

                for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                        /**metoda sprawdzaj�ca czy dany element jest ju� duplikatem w dupl[]*/
                        if (ifisinduplarray(arr[i], dupl, duplcounter)) {
//                                i++;
                                continue;
                        }

                        elem = arr[i];
                        /**metoda sprawdzaj�ca czy dany element jest w og�le duplikatem*/
                        if (ifduplicate(elem, arr)) {
                                dupl[duplindex] = arr[i];
                                duplcounter++;
                                duplindex++;
                        } else{
                                dupl2[duplindex2] = arr[i];
//                                System.out.println(arr[i]);
                                duplcounter2++;
                                duplindex2++;
                        }
                }
                /**metoda skracaj�ca tablic� o niepotrzebne zera na ko�cu, rozmiar nowej tablicy jest zliczany wraz z zapisem duplikat�w*/
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
/**counter ma by� co najmniej 2 aby nie przypisa� do dupl[] elementu kt�ry rozpatrujemy*/
                                counter++;
                                if (counter >= 2) {
                                        return true;
                                }
                        }
                }

                return false;
        }
}
