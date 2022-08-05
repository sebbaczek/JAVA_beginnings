import java.util.Arrays;

/**Napisz program, który znajdzie druga najwiêksz¹ wartoœæ w tablicy*/
 public class secondMax {
    public static void main(String[] args) {
    int[] arr = {34,35,-7,6,78,-6,158,58,76,-45,23,4,5,3,660,555,777};
       int result = find2Max(arr);
        System.out.println(result);
    }

    private static int find2Max(int[] arr) {
        int max2;
        for (int j = 0; j < arr.length; j++) {
            int elem = arr[j];
           if (elem>arr[arr.length-2]) {
                arr[j] = arr[arr.length-2];
                arr[arr.length-2] = elem;
            }
            else  if (elem>arr[arr.length-1]) {
            arr[j] = arr[arr.length-1];
            arr[arr.length-1] = elem;
        }
           if(arr[arr.length-1]<arr[arr.length-2]){
            int last = arr[arr.length-1];
            int prelast = arr[arr.length-2];
                arr[arr.length-1] = prelast;
                arr[arr.length-2] = last;
            }
        }
        max2 = arr[arr.length-2];
        System.out.println(Arrays.toString(arr));
        return max2;
    }
}
