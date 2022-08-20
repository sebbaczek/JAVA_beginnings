package collections.exc6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**Napisz klas� Square reprezentuj�cej kwadrat. Dodaj konstruktor w kt�rym u�ytkownik mo�e
        okre�li� t� warto��. Do tego dodaj getter oraz setter. Pami�taj o enkapsulacji. Dodaj metod� licz�c�
        obw�d i metod� licz�c� pole kwadratu. Nadpisz metod� equals(). Nadpisz metod� toString(). U�yj
        nast�pnie tej klasy, aby stworzy� kilka kwadrat�w o r�nych bokach i umie�ci� je w li�cie. Dodaj
        kilka zduplikowanych kwadrat�w. Nast�pnie zaproponuj struktur�, kt�ra pozwoli usun�� duplikaty
        z kolekcji element�w*/
public class Main {
        public static void main(String[] args) {
                List<Square>list=new ArrayList<>();
                list.add(new Square(3));
                list.add(new Square(4));
                list.add(new Square(5));
                list.add(new Square(6));
                list.add(new Square(5));
                list.add(new Square(4));
                list.add(new Square(4));
                list.add(new Square(7));
                list.add(new Square(9));

                System.out.println(list);
                Set<Square> set = new HashSet<>(list);
                System.out.println(set);

        }
}
