package lambda.exc2;



/** Stw�rz interface funkcyjny z metod� przyjmuj�c� int i String i zwracaj�c� String. Zaimplementuj ten
 interface przy wykorzystaniu lambdy. Spr�buj zapisa� lambd� na par� pokazanych sposob�w*/

public class Main {
        public static void main(String[] args) {
                Lambdable2 lambdable2 = (somelambda1,somelambda2) -> somelambda2+somelambda1;
                System.out.println(lambdable2.count(5,"times"));
                Lambdable2 lambdable3 = (int counter, String string) -> {
                        return string+counter;
                };
                System.out.println(lambdable3.count(4,"hello"));
//                Lambdable2 lambdable4 = (String string, int counter) -> {
//                        return string+counter;
//                };
//                System.out.println(lambdable4.count(4,"hello"));
        }
}
