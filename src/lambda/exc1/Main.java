package lambda.exc1;

/**
 * Stw�rz interface funkcyjny z metod� przyjmuj�c� int i zwracaj�c� String. Zaimplementuj teninterface przy wykorzystaniu lambdy. Spr�buj zapisa� lambd� na par� pokazanych sposob�w.
 */

public class Main {
        public static void main(String[] args) {

                Lambdable lambdable = counter1 -> counter1 += (5);
                System.out.println(lambdable.count(4));

                Lambdable lambdable2 = counter1 ->  {
                        counter1 += (5);
                        return counter1;
                };
                System.out.println(lambdable2.count(6));

                Lambdable lambdable3 = (int counter1) ->  {
                        counter1 += (5);
                        return counter1;
                };
                System.out.println(lambdable3.count(7));

        }



}
