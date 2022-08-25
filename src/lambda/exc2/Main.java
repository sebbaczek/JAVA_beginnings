package lambda.exc2;



/** Stwórz interface funkcyjny z metod¹ przyjmuj¹c¹ int i String i zwracaj¹c¹ String. Zaimplementuj ten
 interface przy wykorzystaniu lambdy. Spróbuj zapisaæ lambdê na parê pokazanych sposobów*/

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
