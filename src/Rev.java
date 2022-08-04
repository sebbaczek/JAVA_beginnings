public class Rev {
    public static void main(String[] args) {
        String s = "Sebastian5";
        reverse(s);
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
