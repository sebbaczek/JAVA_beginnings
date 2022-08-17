package java_oop.exceptions.exc2;
/** Stwórz metodê, która przyjmuje wiek na wejœciu. Napisz walidacjê, która sprawdza czy podany wiek
         jest wiêkszy ni¿ 21, je¿eli nie jest, wyrzuæ wyj¹tek checked. Nastêpnie stwórz kolejn¹ metodê np.
         wrapper(), która w bloku try-catch z³apie ten wyj¹tek i zredeklaruje go jako runtime. Wywo³aj
         metodê wrapper(). Zwróæ uwagê, ¿e je¿eli wrapowanie w RuntimeException zamieniono by na
         wrapowanie w Exception, to ten nowy wyj¹tek nale¿a³oby albo obs³u¿yæ (try-catch), albo
         zadeklarowaæ, ¿e metoda wrapper go wyrzuci*/
public class Main {
        public static void main(String[] args) {

                wrapper();


        }

        private static void wrapper() throws RuntimeException {

                        try {
                                agemethod(20);
                        } catch (MyException2 e) {
                                throw new RuntimeException(e);
                       };
                }



        private static void agemethod(int age) throws MyException2 {
                if(age>21){

                }else {
                        throw new MyException2("Invalid arg");
                }
        }

}
