import java.util.Arrays;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("kokis"));

        String x = "zakaz";
        int y = x.length();
        int[] palindrom1 = new int[y];
        int[] palindrom2 = new int[y];
        for (int i = 0; i < y; i++) {
            palindrom1[i] = x.charAt(i);
            System.out.println(Arrays.toString(palindrom1));
        }
        int z = 0;
        for (int i = y - 1; i >= 0; i--) {
            palindrom2[z] = x.charAt(i);
            System.out.println(Arrays.toString(palindrom2));
            z++;
        }
        if (Arrays.equals(palindrom1, palindrom2)) {
            System.out.println(x + " jest palindromem");
        } else {
            System.out.println(x + " nie jest palindromem");

        }
    }
private static boolean isPalindrom(String word){
    for (int i = 0; i < word.length()/2; i++) {
        if(word.charAt(i) != word.charAt(word.length()-1-i)){
            return false;
        }
    }
    return true;
}



}
