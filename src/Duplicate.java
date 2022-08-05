import java.util.Arrays;

public class Duplicate {
    public static void main(String... args) {
        int[] arr = {3, 4, 5, 5, 6, 6, 7, 8, 9, 9, 9, 11, 11, 12, 13, 14, 15, 15};
        Arrays.sort(arr);
        searchind(arr);

    }

    private static int[] searchind(int[] arr) {
        final int[] dupl = new int[arr.length / 2];
        int duplcounter = 0,duplindex = 0;
        int elem;
//        int elem =0;
        for (int i = 0; i < arr.length;  i++) {
            //            System.out.println(elem+"   "+arr);
//            elem = arr[i];
//                   System.out.println(elem +"sw");
//            System.out.println(elem);
            if(ifisinduplarray(arr[i], dupl)){
                i++;
                continue;
            }
            elem = arr[i];
            //          System.out.println(elem +"sw2");
//            System.out.println(elem);
//            if (elem)
            if (ifduplicate(elem, arr)) {
                //          System.out.println(elem +"sw3");
//                System.out.println(Arrays.toString(arr));
//                System.out.println(elem);
//                System.out.println(arr[i]);
//                System.out.println(duplindex);
                dupl[duplindex] = arr[i];

                duplcounter++;
//

                duplindex++;

            }
            System.out.println(i);
            //        System.out.println(elem);

        }
        System.out.println(duplcounter);
        System.out.println(Arrays.toString(dupl));
        int[] extable = new int[duplcounter];
        for (int i = 0; i < duplcounter; i++) {
            extable[i]=dupl[i];
        }
        System.out.println(Arrays.toString(extable));
        return extable;
    }

    /**
     * print duplicates
     */
//    private static void searchduplicates(int[] arr) {
//        Arrays.sort(arr);
//        int[] dupl = new int[arr.length / 2];
//        int duplindex = 0;
//        int elem;
//        for (int i = 0; i < arr.length;  i++) {
//
//            if(ifisinduplarray(arr[i], dupl)){
//                i++;
//            }
//            elem = arr[i];
//
//            if (ifduplicate(elem, arr)) {
//
//                dupl[duplindex] = arr[i];
////
//
//                duplindex++;
//
//            }
//            System.out.println(i);
//
//        }
//        System.out.println(Arrays.toString(dupl));
//    }

    private static boolean ifisinduplarray( int elem1,  int[] dupl) {
//        System.out.println(elem1);
        for (int ind : dupl) {
//            System.out.println(ind);
            if(ind==elem1){
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
//        System.out.println(elem2+" "+args);
        //     System.out.println(elem2 +"ds");

        int counter = 0;
        int[] table = args;
//        System.out.println(table);
        for (int ind2 : table) {
//            System.out.println(elem2);
//            System.out.println(ind2);
//            System.out.println(Arrays.toString(table));
//            System.out.println(Arrays.toString(table));
            //    System.out.println(elem2 +"ds");

            if (elem2 == ind2) {

                counter++;
                //    System.out.println(counter);
//                System.out.println(table[ind2]);
//                System.out.println(elem+"   "+args[i]);
                if (counter>=2) {

                    return true;
                };
            }

        }
        return false;
    }
}
//                for (int elem : dupl) {
//                    System.out.println(elem==arr[i]);
//                    if(elem == arr[i]){
//                        break;
//                    } else {
//                        dupl[i] = arr[i];
//                    }
//                }

//            }
//            if (arr[i] == arr[i-1]){
//                dupl[i] = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(dupl));
//        return dupl;
//    }
//}
