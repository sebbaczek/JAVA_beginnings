package optional.exc3;

import java.math.BigInteger;

/**Napisz program do liczenia silni przy wykorzystaniu BigInteger*/
public class Main {
        public static void main(String[] args) {
                int x =15;
                System.out.println(factorial(x));
                System.out.println(factorial(10));
                System.out.println(factorial(20));
                System.out.println(factorial(5));
                System.out.println(factorial(0));
                System.out.println(factorial(1));
                System.out.println(factorial(2));
                System.out.println(factorial(3));
                System.out.println(factorial(4));
                System.out.println(factorial(5));
                System.out.println(factorial(6));
                System.out.println(factorial(7));
                System.out.println(factorial(3));



        }

        private static BigInteger factorial(int x) {
                BigInteger bint = BigInteger.valueOf(1);
                BigInteger b = BigInteger.valueOf(x);
                for (int i = 1; i <= x; i++) {
                       bint = bint.multiply(BigInteger.valueOf(i));

                }
                return bint;
        }
}
