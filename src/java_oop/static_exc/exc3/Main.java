package java_oop.static_exc.exc3;

/**Stwórz klasê abstrakcyjn¹ AParent, która bêdzie mia³a metodê String getName() oraz statyczn¹
        metodê String getClassName(). Stwórz klasê Child, która bêdzie nadpisywa³a metodê String
        getName() oraz definiowa³a statyczn¹ metodê String getClassName(). U¿yj dziedziczenia. Stwórz 2
        instancje klasy Child przypisuj¹c je do referencji Parent oraz Child. Wywo³aj obie metody na
        referencjach, ich wynik wydrukuj na ekranie. Zauwa¿ ró¿nicê i postaraj siê znaleŸæ wyjaœnienie.*/
public class Main {

        public static void main(String[] args) {

                Child child1 = new Child();
                AParent child2 = new Child();
                System.out.println(child1.getName());
                System.out.println(child2.getName());
                System.out.println(child1.getClassName());
                System.out.println(child2.getClassName());
        }
}
