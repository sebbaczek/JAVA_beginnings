import java.util.Arrays;
/** Napisz program, który porówna ze sob¹ zawartoœæ dwóch tablic i wydrukuje na ekranie, czy zawartoœæ jest taka sama. kolejnoœæ wejœciowa elementów nie ma znaczenia. Liczy siê tylko  zawartoœæ, np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3].*/

public class TableComparing {
    public static void main(String[] args) {
        int[] table1 = {25, 24, 63, 53};
        int[] table2 = {25, 24, 63, 51};
        int[] table3 = {25, 24, 53, 63};
        boolean wynik = compare(table1, table3);
        if (wynik) {
            System.out.println("Tabele maj¹ tê sam¹ zawartoœæ");
        } else {
            System.out.println("Tabele nie maj¹ tej samej zawartoœci");
        }
        /**metoda boolean equals = Arrays.equals(table1,table2)*/
        comparemethod2(table1, table2);
    }

    private static void comparemethod2(int[] table1, int[] table2) {
        Arrays.sort(table1);
        Arrays.sort(table2);

        boolean equals = Arrays.equals(table1,table2);
        System.out.println("comparemethod2 equal? "+equals);


    }

    private static boolean compare(int[] table1, int[] table2) {
        if(table1.length != table2.length){return false;}

        int[] comptable = new int[table1.length];
        first:
        for (int i = 0; i < table1.length; i++) {
            second:
            for (int j = 0; j < table2.length; j++) {
                int el = table2[j];
                if (table1[i] == el) {
                    comptable[i] = el;
                    continue first;
                }
                if ((table1[i] != el)&&(j==table2.length-1)) {
                    return false;
                }
            }
        }
        System.out.println(Arrays.toString(comptable));
    return true;
    }
}
