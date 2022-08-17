package java_oop.exceptions.exc1;

/**
 * Stw�rz sw�j w�asny checked exception. Zdefiniuj konstruktor, kt�ry pozwala przekaza� wiadomo��
 * na etapie tworzenia wyj�tku. Stw�rz metod�, kt�ra go wyrzuci. Nast�pnie obs�u� ten wyj�tek w
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
