package collections.exc6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**Napisz klasê Square reprezentuj¹cej kwadrat. Dodaj konstruktor w którym u¿ytkownik mo¿e
        okreœliæ tê wartoœæ. Do tego dodaj getter oraz setter. Pamiêtaj o enkapsulacji. Dodaj metodê licz¹c¹
        obwód i metodê licz¹c¹ pole kwadratu. Nadpisz metodê equals(). Nadpisz metodê toString(). U¿yj
        nastêpnie tej klasy, aby stworzyæ kilka kwadratów o ró¿nych bokach i umieœciæ je w liœcie. Dodaj
        kilka zduplikowanych kwadratów. Nastêpnie zaproponuj strukturê, która pozwoli usun¹æ duplikaty
        z kolekcji elementów*/
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
