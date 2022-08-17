package java_oop.exceptions.exc1;

/**
 * Stwórz swój w³asny checked exception. Zdefiniuj konstruktor, który pozwala przekazaæ wiadomoœæ
 * na etapie tworzenia wyj¹tku. Stwórz metodê, która go wyrzuci. Nastêpnie obs³u¿ ten wyj¹tek w
 * bloku try-catch-finally. W catch, wydrukuj StackTrace na ekranie.
 */
public class Main {
        public static void main(String[] args) {

                try {
                        method1(25);
                } catch (MyException e) {
                        System.out.println(e.getMymessage());
                        e.printStackTrace();
                } catch (MyException2 e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                } finally {
                        System.out.println("Finally");
                }


        }

        private static void method1(int number) throws MyException,MyException2 {
                if (number < 20) {
                        throw new MyException("Invalid number");
                } else if (number < 30){
                        throw new MyException2("Invalid number2");
                }
        }
}
