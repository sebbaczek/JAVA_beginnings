import java.util.Arrays;

/**
 * Napisz program, który w tablicy znajdzie pary których suma wynosi podan¹ przez Ciebie wartoœæ
 */
public class SumFinder {
        public static void main(String[] args) {
                int[] arr = {34, 35, -7, 6, 78, -6, 158, 58, 76, 0, 5, -45, 23, 4, 5, 3, 5, 660, 555, 777, 4, -7, 6, 78, -6, 158, 58, 76, -45};
                int number = 10;
                sumfinder(arr, number);
        }

        private static void sumfinder(int[] arr, int number) {
                Arrays.sort(arr);
                System.out.println(Arrays.toString(arr));
//        int counter=0;  int k =0;
//        int numbers[] = new int[arr.length];
//        int[] pairings = new int[2];
                /**trzeba usun¹æ zduplikowane wartoœci*/
                for (int i = 0; i < arr.length; i++) {
//            if((i !=arr.length-1)&&(arr[i]==arr[i+1])){continue;}

                        for (int j = i + 1; j < arr.length; j++) {
//                System.out.println(arr[i+1]);
//                if ((i==j)||(arr[i]==arr[i+1])){continue;}
                                if (i == j) {
                                        continue;
                                }
                                int el = arr[i];
                                int el2 = arr[j];
                                if (el + el2 == number) {
//                    if ((el+el2==number)&&(i!=j)){

                                        System.out.println(el + "  " + el2);

                                }

                        }
//            for (int el2 : arr) {

//                if (el + el2 == number) {
//                    counter += 2;
//
//                    numbers[k] = el;
//                    numbers[k + 1] = el2;
//                    k = k +2;
//
//                }
//                System.out.println(k);
//
//                    System.out.println(Arrays.toString(numbers));

//                    int counter1 = 0, counter2 = 0;
//                    for (int k : arr) {
//                        if (k == el) {
//                            counter1++;
//                        }
//                        if (k == el2) {
//                            counter2++;
//                        }
//                        int n1, n2;
//                        if (counter1 > 1) {
//
//                             pairings[0] = el;
//                        }
//                        if (counter2 > 1) {
//
//                            pairings[1] = el2;
//                        }
//                        System.out.println(Arrays.toString(pairings));
//                        int[] pairings = {n1, n2};

//                    int counter1=0,counter2=0;
//                    for (int k : arr) {
//                        if (k == el){
//                            counter1++;
//                        }
//                        if (k == el2){
//                            counter2++;
//                        }
//
//                    }

//                    System.out.println(el+"  "+el2);
//                    }


//            }
//        return new int[2];
                }
        }
}
