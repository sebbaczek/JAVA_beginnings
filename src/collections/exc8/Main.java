package collections.exc8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Stw�rz map� Map<Integer, String>, kt�ra zawiera imiona i nazwiska uczni�w w klasie razem z ich
        numerami w dzienniku. Nast�pnie stw�rz list� imion i nazwisk, uczni�w, kt�rzy maj� w dzienniku
        numery w zakresie od a (inclusive) do b (exclusive).*/
public class Main {
        public static void main(String[] args) {
                Map<Integer, String> diary = new HashMap<>();
                diary.put(1,"Jan Kowalski");
                diary.put(2,"Jania Bowalski");
                diary.put(3,"Bania Swalski");
                diary.put(4,"Jan Awalski");
                diary.put(5,"Pan Towalski");
                diary.put(6,"Alan Jowalski");
                diary.put(7,"Alana Mowalski");
                diary.put(8,"Bania Nowalski");
                diary.put(9,"Pan Uwalski");
                diary.put(10,"Ban Cowalski");
                diary.put(11,"Ban Rowalski");

                Map<Integer, String> result = new HashMap<>();
                List<String> list = new ArrayList<>();
                int a = 3,b=9;
                for (int i = a; i < b; i++) {
                        for (Integer number : diary.keySet()) {
                                if (i==number){
                                        result.put(i, diary.get(i));
                                        list.add(diary.get(i));

                                }
                        }
                }



                System.out.println(result);
                System.out.println(list);

        }
}
