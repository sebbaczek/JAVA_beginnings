package collections.exc1;


import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**Maj¹c Set z elementami typu String, wydrukuj na ekranie ka¿dy element oddzielony przecinkiem
        przy wykorzystaniu iteratora.*/
public class Main {
;


        public static void main(String[] args) {
                String[] animal = {"kot", "pies", "mysz", "bocian"};
                Set<String> animals = new HashSet<>(List.of(animal));

              Iterator el =  animals.iterator();
               while (el.hasNext()){
                       System.out.println(el.next());

               }




        }
}
