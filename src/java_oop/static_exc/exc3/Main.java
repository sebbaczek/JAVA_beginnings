package java_oop.static_exc.exc3;

/**Stw�rz klas� abstrakcyjn� AParent, kt�ra b�dzie mia�a metod� String getName() oraz statyczn�
        metod� String getClassName(). Stw�rz klas� Child, kt�ra b�dzie nadpisywa�a metod� String
        getName() oraz definiowa�a statyczn� metod� String getClassName(). U�yj dziedziczenia. Stw�rz 2
        instancje klasy Child przypisuj�c je do referencji Parent oraz Child. Wywo�aj obie metody na
        referencjach, ich wynik wydrukuj na ekranie. Zauwa� r�nic� i postaraj si� znale�� wyja�nienie.*/
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
