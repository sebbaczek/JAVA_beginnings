package optional.exc1;
/**Napisz program, który sprawdzi czy dane zdanie jest palindromem. Wykorzystaj StringBuilder*/
public class Main {
        public static void main(String[] args) {
                String sentence = "kajak";
                StringBuilder sb = new StringBuilder(sentence);
                System.out.println(ifPalindrom(sb));


        }

        private static boolean ifPalindrom(StringBuilder sb) {
                String sb2 = sb.toString();
                String sb1 = sb.reverse().toString();
                System.out.println(sb);
//
                if(sb2.equals(sb1)){
                        return true;
                }
                return false;
        }
}
