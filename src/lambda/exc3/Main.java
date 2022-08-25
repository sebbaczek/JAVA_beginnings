package lambda.exc3;
/**Stwórz interface funkcyjny z metod¹ przyjmuj¹c¹ int, int oraz String i zwracaj¹c¹ String.
 Zaimplementuj ten interface przy wykorzystaniu lambdy. Spróbuj zapisaæ lambdê na parê
 pokazanych sposobów.*/

public class Main {
        public static void main(String[] args) {
                Lambdable3 lambdable3 = (param1int,param2int,param3string)->param1int+param2int+param3string;
                System.out.println(lambdable3.count(45,55,"sto"));
                Lambdable3 lambdable4 = (int param1int,int param2int,String param3string)-> {
                        int sum = param1int + param2int;
                        return sum+ param3string;
                };
                System.out.println(lambdable4.count(45,55,"sto"));
                Lambdable3 lambdable5 = (int param1int,int param2int,String param3string)-> "new text";
                System.out.println(lambdable5.count(45,55,"sto"));
        }
}
