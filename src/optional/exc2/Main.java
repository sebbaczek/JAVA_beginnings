package optional.exc2;
/**Napisz program, który dla podanego jako StringBuilder zdania, zamieni we wszystkich s³owach,
 pierwsze litery na pisane z wielkiej litery (upper case). U¿yj StringBuilder*/
public class Main {
        public static void main(String[] args) {
                String sentence = "kajak";
                StringBuilder sb = new StringBuilder(sentence);
                System.out.println(changeFirstCase(sb));
        }

        private static String changeFirstCase(StringBuilder sb) {
        }
}
