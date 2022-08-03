import java.util.Arrays;

public class Iter {
    public static void main(String[] args) {
        String[] litery = {"a", "b", "c", "d", "e", "f"};

        /**pêtle iter na tabeli 1-wymiarowej String*/
        for (String s : litery) {
            System.out.println(s + "a");
        }
        /**pêtle iter na tabeli 2-wymiarowej String*/
        String[][] litery2 = {{"a", "b"}, {"c", "d"}, {"e", "f"}};

        for (String[] row : litery2) {
            System.out.println(Arrays.toString(row));

            for (String s : row) {
                System.out.print(s);
                System.out.println();
            }
        }

        int[][] liczby = {{3, 6}, {23, 62}, {53, 64}};

        /**pêtle iter na tabeli 2-wymiarowej*/
        for (int[] row : liczby) {
//         System.out.println(Arrays.toString(row));
            System.out.print("[");
            for (int liczba : row) {
                System.out.print(liczba + ",");
            }
            System.out.print("],");
            System.out.println();
        }

        /**wypisywanie tabeli 2-wymiarowej*/
        for (int j = 0; j < liczby.length; j++) {
                    int row[] = liczby[j];
//                       System.out.println();
//                       System.out.printf(Arrays.toString(row));
                    if (j == 0) {
                        System.out.print("[");
                    }

                            for (int i = 0; i < row.length; i++) {

                                    if (i == 0) {
                                        System.out.print("[");
                                    }

                                    System.out.print(row[i]);

                                    if (!(i == row.length - 1)) {
                                        System.out.print(",");
                                    } else {
                                        System.out.print("]");
                                    }
                            }
                    if (j == liczby.length - 1) {
                        System.out.print("]");
                    } else {
                        System.out.print(",");
                    }

        }


    }
}
