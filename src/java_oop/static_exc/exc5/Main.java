package java_oop.static_exc.exc5;

import java_oop.static_exc.exc3.AParent;
import java_oop.static_exc.exc3.Child;

/**
Stw�rz interfejs IParent, kt�ry b�dzie mia� metod� defaultow� String getName() oraz statyczn�
        metod� String getClassName(). Stw�rz klas� AnotherChild, kt�ra b�dzie nadpisywa�a metod� String
        getName() oraz definiowa�a statyczn� metod� String getClassName(). U�yj dziedziczenia. Stw�rz 2
        instancje klasy Child przypisuj�c je do referencji Parent oraz Child. Wywo�aj obie metody na
        referencjach, ich wynik wydrukuj na ekranie. Zauwa� r�nic� i postaraj si� znale�� wyja�nienie.
*/


public class Main {
        public static void main(String[] args) {

                AnotherChild child1 = new AnotherChild();
                IParent child2 = new AnotherChild();

                System.out.println(child1.getName());
                System.out.println(child2.getName());
                System.out.println(child1.getClassName());
                System.out.println(IParent.getClassName());
        }
}