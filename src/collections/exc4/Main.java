package collections.exc4;

import javax.swing.*;
import java.util.*;

/**
 * Napisz metodê, która na podstawie przekazanej do niej listy Integerów, przeniesie najwy¿sz¹
 * wartoœæ na koniec listy. Stwórz 2 wersje metody, pierwsz¹ modyfikuj¹c¹ obecn¹ listê, drug¹
 * zwracaj¹c¹ now¹ listê. Je¿eli wartoœæ maksymalna siê powtarza, napisz kod w ten sposób, ¿eby na
 * koñcu listy pojawi³o siê tylko jedno wyst¹pienie tej wartoœci, a zniknê³o ono z oryginalnych miejsc
 */
public class Main {
        public static void main(String[] args) {

//                Integer[] array={3,4,5,6,7,8,9,10,88,33,33,3,6,8,2,1,3,4,1,7};
                List<Integer> list = List.of(3, 4, 5, 6, 7, 8, 9, 10, 33, 33, 3, 6, 8, 2, 1, 3, 4, 1, 7);
                System.out.println(list);
                System.out.println(method1(list));
                method2(list);


        }

        private static void method2(List<Integer> list) {
                List<Integer> list2 = new ArrayList<>(list);
                Object[] list3 = list2.toArray();
                Arrays.sort(list3);
                Integer max = (Integer) list3[list3.length - 1];
                List<Integer> indexes = new ArrayList<>();
                for (Integer el : list2) {
                        if (el == max) {
                                indexes.add(el);

                        }
                }

                list = new ArrayList<>(list);
                list.removeAll(indexes);
                list.add(max);
                System.out.println("method2: "+list);


        }

        private static List<Integer> method1(List<Integer> list) {

/** wartoœæ maksymalna z kopii tablicy
 Integer[] array1= new Integer[array.length];
 for (int i = 0; i < array.length; i++) {
 array1[i]=array[i];
 }
 Arrays.sort(array1);
 Integer max = array1[array1.length-1];
 System.out.println(max);
 */

//               List<Integer> list = new LinkedList<>(Arrays.asList(array));
                List<Integer> list2 = new ArrayList<>(list);
//                Set<Integer> list4 = new HashSet<>(list2);
//                System.out.println(list4);
                Object[] list3 = list2.toArray();
                Arrays.sort(list3);
//                System.out.println(Arrays.toString(list3));
                Integer max = (Integer) list3[list3.length - 1];
//                Integer maxcopy = max;
//                System.out.println(list2);
                List<Integer> indexes = new ArrayList<>();
//                for (Integer el2 : list2) {
//                        if (el2 == max) {
                for (Integer el : list2) {
//                                        System.out.println(list2.indexOf(el));
                        if (el == max) {
                                indexes.add(el);
//                                            maxcopy=el;
//                                                list2.add(el);
//                                                System.out.println(list2);
//                                                return;
                        }
                }
//                System.out.println(list2);
                list2.removeAll(indexes);
                list2.add(max);
//                System.out.println(list2);
                return list2;

//                Iterator it = list2.iterator();
//                                while (list2.iterator().hasNext()){
//                                        if (it.next()==max){
//                                                System.out.println(list2.indexOf(it.next()));
//
//
//                                        }
//                                }

//                System.out.println(indexes);
//                        }
//                }

//                System.out.println(list2);
        }
}
