package optional.exc2;

/**
 * Napisz program, który dla podanego jako StringBuilder zdania, zamieni we wszystkich s³owach,
 * pierwsze litery na pisane z wielkiej litery (upper case). U¿yj StringBuilder
 */
public class Main {
        public static void main(String[] args) {
                String sentence = "kajak jest du¿y z";
                StringBuilder sb = new StringBuilder(sentence);

                System.out.println(changeFirstCase(sb));
        }

        private static StringBuilder changeFirstCase(StringBuilder sb) {
//                System.out.println(sb.length());
                for (int i = 1; i < sb.length(); i++) {
                        if (Character.isSpaceChar(sb.charAt(i - 1))) {
                                String ch = Character.toString(sb.charAt(i)).toUpperCase();
                                sb.replace(i, i+1, ch);
                                System.out.println(ch);
                        }
                        if (i - 1 == 0 && !Character.isSpaceChar(sb.charAt(0))) {
                                String ch1 = Character.toString(sb.charAt(0)).toUpperCase();
                                sb.replace(0, 1, ch1);
                        }
                }
                return sb;
        }
}
