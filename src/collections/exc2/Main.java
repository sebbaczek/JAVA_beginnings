package collections.exc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Napisz program, kt�ry losowo zamieni kolejno�� element�w w podanej li�cie. Do osi�gni�cia efektu
         losowo�ci spr�buj wykorzysta� klas� Random. Wiem, �e nie poruszali�my jej w materia�ach, dlatego
         postaraj si� wykorzysta� google �eby znale�� przyk�ady jej u�ycia. Od razu wyja�ni�, �e robi� to w
         ten spos�b, �eby da� Ci mo�liwo�� �wiczenia szukania informacji na w�asn� r�k�, bo w pracy to jest
         codzienno��*/
public class Main {
        public static void main(String[] args) {
                Object[] array = {"el1","el2","el3","el4","el5","el6","el7"};
                List<Object> list = new ArrayList<>(Arrays.asList(array));

                indexChanger(list);

//                List<Object> list = new ArrayList<>(List.of("el1","el2","el3","el4","el5","el6","el7"));
//                for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.indexOf(i));
//                }
        }

        private static void indexChanger(List<Object> list) {
                for (Object o : list) {
                        int index = list.indexOf(o);
                        Random rand = new Random();
                        int n = rand.nextInt(list.size());
//                        index = n;
//                        list.remove(o);
                        Object el = list.get(n);
                       list.set(n, o);
                       list.set(index, el);

                }
                System.out.println(list);
        }
}
