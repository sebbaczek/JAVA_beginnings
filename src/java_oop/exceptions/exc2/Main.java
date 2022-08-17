package java_oop.exceptions.exc2;
/** Stw�rz metod�, kt�ra przyjmuje wiek na wej�ciu. Napisz walidacj�, kt�ra sprawdza czy podany wiek
         jest wi�kszy ni� 21, je�eli nie jest, wyrzu� wyj�tek checked. Nast�pnie stw�rz kolejn� metod� np.
         wrapper(), kt�ra w bloku try-catch z�apie ten wyj�tek i zredeklaruje go jako runtime. Wywo�aj
         metod� wrapper(). Zwr�� uwag�, �e je�eli wrapowanie w RuntimeException zamieniono by na
         wrapowanie w Exception, to ten nowy wyj�tek nale�a�oby albo obs�u�y� (try-catch), albo
         zadeklarowa�, �e metoda wrapper go wyrzuci*/
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
