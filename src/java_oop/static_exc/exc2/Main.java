package java_oop.static_exc.exc2;
/**
 Stw�rz klas� Static, kt�ra wydrukuje na ekranie kiedy po raz pierwszy zostanie u�yta. Stw�rz w niej
         pola wskazane poni�ej. Stw�rz 5 instancji klasy, za ka�dym razem drukuj�c na ekranie counter i name.
         Pola w klasie:
         ? statyczne counter (zliczaj�ce ile instancji klasy stworzyli�my),
         ? instancyjne name
*/

public class Main {
        public static void main(String[]args){

        Static static1 = new Static("static1");
        Static static2 = new Static("static2");
        Static static3 = new Static("static3");
        Static static4 = new Static("static4");
        Static static5 = new Static("static5");
}
}
