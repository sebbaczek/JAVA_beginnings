package java_oop.static_exc.exc4;

/**
 * Zdefiniuj metodê statyczn¹ signsCreator(), która na podstawie przekazanych liczb (mo¿na
 * przekazaæ dowoln¹ iloœæ) zwróci tablicê char[], ze znakami stoj¹cymi pod podanymi w argumentach
 * miejscami w tablicy ASCII (http://www.asciitable.com/). Za³ó¿my, ¿e do metody mo¿na przekazaæ
 * tylko wartoœci liczbowe z zakresu 32 - 127. Napisan¹ metodê, spróbuj podzieliæ na kroki i ka¿dy krok
 * wyci¹gn¹æ do oddzielnej metody.
 */
;

public class Main {
        public static char[] result;

        static char[] signsCreator(int... args) {
                result = new char[args.length];

                boolean result1 = isScopeValidated(args);
                if (result1 != true) return new char[0];

                charAssign(args);
                return result;

        }

        private static void charAssign(int[] args) {
                for (int i = 0; i < args.length; i++) {
                        int el = args[i];
                        result[i] = (char) el;
                }
        }

        private static boolean isScopeValidated(int[] args) {
                for (int arg : args) {
                        if (!((arg > 31) && (arg < 128))) {
                                System.out.println("Set correct arguments: numbers 32-127");
                                return false;
                        }
                }
                return true;
        }


        public static void main(String[] args) {
                System.out.println(signsCreator(55, 77, 100, 124, 105));
        }
}
