package collections.exc7;

import java.util.*;

/** Napisz metodê, która przyjmuje jako argument String i wydrukuje na ekranie, ile razy wyst¹pi³a
         dana litera (znak) w podanym zdaniu.*/

public class Main {
        public static void main(String[] args) {
                String word="Sebastian Baczek";
                method(word);
                method2(word);


        }

        private static void method2(String word) {
                Map<Character,Integer>map = new HashMap<>();


                for (int i = 0; i < word.length(); i++) {

                        Character sign = word.charAt(i);
//                        int counter = map.get(sign) == null ? 0 : map.get(sign);
                        Integer counter = map.get(sign);
//                        map.put(sign,counter >= 1 ? counter+1 : 1);
                        map.put(sign,counter == null ? 1 : counter+1);

                }
                System.out.println("method2: "+map);



        }

        private static void method(String word) {
                Map<Integer,Character> map = new HashMap<>();
                List<Map>list = new ArrayList<>();
                int counter =1;
                for (int i = 0; i < word.length(); i++) {
                        map.clear();
                        char temp = word.charAt(i);

                                map.put(counter, temp);

                        for (int j = 0; j < word.length(); j++) {
                                if(temp ==word.charAt(j) && i !=j ){
                                        counter++;

                                        map.put(counter,word.charAt(j));

                                }
                        }
                        counter =1;
//                        if (map ) {
                                list.add(map);
                        map = new HashMap<>();
//                        System.out.println(map);
//                        System.out.println(list);
//                        }
//                        System.out.println(map.get(1)+" occurs:"+map.size()+" times");
                }
//                System.out.println(list);
//                for (Map letter : list) {
////                        int counter1= 1;
////                        if(counter1<2) {
//                                System.out.println(letter.get(1) + " occurs:" + letter.size() + " times");
////                        }
//                }
                Set<Map>set = new HashSet<>();
//                System.out.println(list);
                for (Map el : list) {
                        Map mymap = new HashMap<>();
//                        new HashMap<>();
                         mymap.put(el.get(1),el.size());
                        set.add(mymap);
                        mymap = new HashMap<>();
                        mymap.clear();

                }
//                set.toArray();
                for (Map el : set) {

                        System.out.println(el.keySet()+ " occurs:" + el.values() + " times");
                }
//                System.out.println(map);
        }
}
