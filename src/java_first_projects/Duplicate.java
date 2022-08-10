package java_first_projects;

import java.util.Arrays;
 /**Napisz program, kt�ry znajdzie w tablicy zduplikowane elementy i stworzy z nich tablic�. Kolejno�� nie ma znaczenia.*/
public class Duplicate {
    public static void main(String... args) {
        int[] arr = {3, 4, 5, 5, 6, 6, 7, 8, 9, 9, 9, 11, 11, 12, 13, 14, 15, 15, 0, 0, 0};
        Arrays.sort(arr);
        int[] wynik = searchind(arr);
        System.out.println(Arrays.toString(wynik));
    }

    private static int[] searchind(int[] arr) {
        final int[] dupl = new int[arr.length / 2];
        int duplcounter = 0, duplindex = 0;
        int elem;

/**p�tla wywo�uj�ca 2 metody*/
        for (int i = 0; i < arr.length; i++) {
            /**metoda sprawdzaj�ca czy dany element jest ju� duplikatem w dupl[]*/
            if (ifisinduplarray(arr[i], dupl, duplcounter)) {
//                i++;
                continue;
            }
            elem = arr[i];
            /**metoda sprawdzaj�ca czy dany element jest w og�le duplikatem*/
            if (ifduplicate(elem, arr)) {
                dupl[duplindex] = arr[i];
                duplcounter++;
                duplindex++;
            }
        }
        /**metoda skracaj�ca tablic� o niepotrzebne zera na ko�cu, rozmiar nowej tablicy jest zliczany wraz z zapisem duplikat�w*/
        int[] extable = new int[duplcounter];
        for (int i = 0; i < duplcounter; i++) {
            extable[i] = dupl[i];
        }

        return extable;
    }


    private static boolean ifisinduplarray(int elem1, int[] dupl, int duplcounter) {

        for (int i = 0; i < duplcounter; i++) {
            if (dupl[i] == elem1) {
                return true;
            }
        }
        return false;
    }


    /**
     * string jak array
     * String s = "";
     * for (int i = 1; i < arr.length; i++) {
     * if (arr[i] == arr[i - 1]) {
     * s += arr[i - 1]+",";
     * }
     * }
     * s = s.substring(0,s.length()-1);
     * System.out.println(s);
     * System.out.println(s);
     */


    private static boolean ifduplicate(int elem2, int... args) {

        int counter = 0;
        int[] table = args;

        for (int ind2 : table) {
            if (elem2 == ind2) {
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

