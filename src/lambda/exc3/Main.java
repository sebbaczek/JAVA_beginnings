package lambda.exc3;
/**Stw�rz interface funkcyjny z metod� przyjmuj�c� int, int oraz String i zwracaj�c� String.
 Zaimplementuj ten interface przy wykorzystaniu lambdy. Spr�buj zapisa� lambd� na par�
 pokazanych sposob�w.*/

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
