package java_oop.exceptions.exc3;

import java_oop.exceptions.exc1.MyException;
import java_oop.exceptions.exc1.MyException2;

/** Stwórz wyj¹tek rozszerzaj¹cy stworzony przez Ciebie wyj¹tek w æwiczeniu pierwszym. Stwórz
         metodê deklaruj¹c¹ wyrzucenie Exception, ale go z niej nie wyrzucaj. Nastêpnie obs³u¿ tê metodê w
         bloku try-catch, przy czym dodaj kilka catchy (multicatch) tak, aby obs³u¿yæ oddzielnie Twój nowo
         stworzony wyj¹tek, wyj¹tek z æwiczenia pierwszego oraz Exception*/
public class Main {
        public static void main(String[] args) {

                try {
                        method2(45);
                } catch (MyExtendsException e) {
                        System.out.println(e.getMymessage());
                        e.printStackTrace();
                } catch (MyException e) {
                        System.out.println(e.getMymessage());
                        e.printStackTrace();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                } finally {
                        System.out.println("Finally");
                }
        }

        private static void method2(int age) throws MyExtendsException,MyException{
                if (age < 44) {
//                        throw new MyExtendsException("extending exception");
                        System.out.println("extending exception");
                }else  if (age > 44) {
                        throw new MyException("extending exception2");
//                        System.out.println("extending exception2");
                }


        }
}
