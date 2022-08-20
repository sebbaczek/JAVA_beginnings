package collections.exc2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Napisz program, który losowo zamieni kolejnoœæ elementów w podanej liœcie. Do osi¹gniêcia efektu
         losowoœci spróbuj wykorzystaæ klasê Random. Wiem, ¿e nie poruszaliœmy jej w materia³ach, dlatego
         postaraj siê wykorzystaæ google ¿eby znaleŸæ przyk³ady jej u¿ycia. Od razu wyjaœniê, ¿e robiê to w
         ten sposób, ¿eby daæ Ci mo¿liwoœæ æwiczenia szukania informacji na w³asn¹ rêkê, bo w pracy to jest
         codziennoœæ*/
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
