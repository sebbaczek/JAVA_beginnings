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
                Map<Integer, String> register = new HashMap<>();
                register.put(1,"Jan Kowalski");
                register.put(2,"Jania Bowalski");
                register.put(3,"Bania Swalski");
                register.put(4,"Jan Awalski");
                register.put(5,"Pan Towalski");
                register.put(6,"Alan Jowalski");
                register.put(7,"Alana Mowalski");
                register.put(8,"Bania Nowalski");
                register.put(9,"Pan Uwalski");
                register.put(10,"Ban Cowalski");
                register.put(11,"Ban Rowalski");

                Map<Integer, String> result = new HashMap<>();
                List<String> list = new ArrayList<>();
                int a = 3,b=9;
                for (int i = a; i < b; i++) {
                        for (Integer number : register.keySet()) {
                                if (i==number){
                                        result.put(i, register.get(i));
                                        list.add(register.get(i));

                                }
                        }
                }



                System.out.println(result);
                System.out.println(list);

                System.out.println("method2: "+ method2(register,a,b));

        }

        private static List<String> method2(Map<Integer, String> register, int a, int b) {
        List<String>list = new ArrayList<>();
                for (Map.Entry<Integer, String> entry : register.entrySet()) {
                        if(entry.getKey()>=a && entry.getKey()<b){
                                list.add(entry.getValue());
                        }
                }
                
        return list;
        }
}
