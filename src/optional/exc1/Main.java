package optional.exc1;
/**Napisz program, kt?ry sprawdzi czy dane zdanie jest palindromem. Wykorzystaj StringBuilder*/
public class Main {
        public static void main(String[] args) {
                String sentence = "kajak";
                StringBuilder sb = new StringBuilder(sentence);
                System.out.println(ifPalindrom(sb));


        }

        private static boolean ifPalindrom(StringBuilder sb) {
                StringBuilder sb3 = new StringBuilder(sb.toString().replace(" ",""));
                String sb2 = sb3.toString();
                String sb1 = sb3.reverse().toString();
                System.out.println(sb);
//
                if(sb2.equals(sb1)){
                        return true;
                }
                return false;
        }
}
