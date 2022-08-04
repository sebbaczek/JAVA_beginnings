import java.util.Arrays;

public class Duplicate {
    public static void main(String... args) {
        int[] arr = {3,4,5,5,6,6,7,8,9,9,9,11,11,12,13,14,15,15};
        searchduplicates(arr);
    }
/**print duplicates*/
    private static int[] searchduplicates(int[] arr) {
//        int... arr;
        Arrays.sort(arr);


        for (int i = 1; i < arr.length; i++) {


            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
//                int[] arr2 = new int[i];
            }
        }
        return arr;
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
