package java_first_projects;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {3,256,35,4,56,0,58,0,7,4,83,2,6,3,27,9,5,6,4,3,5,69,3,2,4};
        /**sortowanie tabeli*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        /**szukanie w posortowanej tabeli; w nieposortowanej mo¿e zwróciæ pozycjê na której dana liczba by siê znalaz³a ze znakiem minus -1*/
        int pos = Arrays.binarySearch(arr,58);
        System.out.println(pos);

        int[] table = {5,13,16,7,9,12};
        int[] table2 = {5,13,16,7,9,12,12,12};
        bubblesort(table);
        System.out.println("sorted "+Arrays.toString(table));

        int searchIndex = searchIndex(table2,5);
        System.out.println("szukany indeks to "+searchIndex);
        searchIndex2(table2,12);
        searchAllIndexes(table2,12);



    }
    private static void bubblesort(int[] array){
        for (int i = 0; i < array.length; i++) {
            /**w ka¿dej iteracji j oszczêdzamy przez zmniejszanie d³ugoœci length-i*/
            for (int j = 1; j < (array.length-i); j++) {
                if(array[j-1]>array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println("swap"+Arrays.toString(array)); /**po ka¿dym porównaniu*/
                } else{
                    System.out.println("don't swap "+array[j-1]+" i "+array[j]);
                }
            }
            System.out.println("iteracja "+i+" "+Arrays.toString(array));
            System.out.println();
        }
    }
    /**zwraca szukany index w 1. wyst¹pieniu*/
    private static int searchIndex(int[] array, int elem){
        int wynik = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==elem){
                wynik = i;
//                System.out.println(i);
//                return wynik;
            }

        }
        return wynik;
    }
    /**wypisuje szukany index*/
    private static void searchIndex2(int[] array, int elem){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==elem){
                System.out.println(i);
                return;
            }
        }
    }
    /**wypisuje szukany index we wszystkich wyst¹pieniach*/
    private static void searchAllIndexes(int[] array, int elem){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==elem){
                System.out.println(i);
            }
        }
    }
}
