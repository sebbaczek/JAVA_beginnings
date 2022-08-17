package java_oop.static_exc.exc5;

import java_oop.static_exc.exc3.AParent;
import java_oop.static_exc.exc3.Child;

/**
Stwórz interfejs IParent, który bêdzie mia³ metodê defaultow¹ String getName() oraz statyczn¹
        metodê String getClassName(). Stwórz klasê AnotherChild, która bêdzie nadpisywa³a metodê String
        getName() oraz definiowa³a statyczn¹ metodê String getClassName(). U¿yj dziedziczenia. Stwórz 2
        instancje klasy Child przypisuj¹c je do referencji Parent oraz Child. Wywo³aj obie metody na
        referencjach, ich wynik wydrukuj na ekranie. Zauwa¿ ró¿nicê i postaraj siê znaleŸæ wyjaœnienie.
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