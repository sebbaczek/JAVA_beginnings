import java.util.Arrays;
/** Napisz program, kt�ry por�wna ze sob� zawarto�� dw�ch tablic i wydrukuje na ekranie, czy zawarto�� jest taka sama. kolejno�� wej�ciowa element�w nie ma znaczenia. Liczy si� tylko  zawarto��, np. [2, 6, 1, 12] == [12, 6, 1, 2] ale [2, 6, 1, 12] != [12, 6, 1, 3].*/

public class TableComparing {
    public static void main(String[] args) {
        int[] table1 = {25, 24, 63, 53};
        int[] table2 = {25, 24, 63, 53};
        int[] table3 = {25, 24, 53, 63};
        boolean wynik = compare(table1, table3);
        if (wynik) {
            System.out.println("Tabele maj� t� sam� zawarto��");
        } else {
            System.out.println("Tabele nie maj� tej samej zawarto�ci");
        }
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
