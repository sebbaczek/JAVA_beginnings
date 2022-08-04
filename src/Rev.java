import java.util.Arrays;

public class Rev {
    public static void main(String[] args) {
        String s = "Sebastian5";
        int[] arr={5,7,9,10,11,14,16};
        reverse(s);
        revarr(arr);
    }
    /** odwraca tablicê*/
    private static void revarr(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length-1-i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    /** odwraca s³owo*/
    private static void reverse(String s) {
        String rev = "";
        for (int i = s.length()-1; i >=0; i--) {
             rev = rev+ s.charAt(i);
        }
        System.out.println(rev);
    }
}
