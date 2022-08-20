package collections.exc5;

import java.util.*;
import java.util.Random;

/** Stwórz listê zawieraj¹c¹ 100 liczb. Spróbuj wykorzystaæ klasê Random do wygenerowania wartoœci
         losowych w zakresie od 0 do 10 (klasa ta zosta³a wspomniana w zadaniach poprzednich). Nastêpnie
         wydrukuj na ekranie ile razy ka¿dy z elementów zosta³ wylosowany. Wykorzystaj Map.*/
public class Main {
        public static void main(String[] args) {
//                List<Integer> list = new ArrayList<>();
                Random rand = new Random();
                Map<Integer,Integer> map = new HashMap<>();
                for (int i = 0; i < 100; i++) {
                        int n = rand.nextInt(11);
                        map.put(i,n);
                }
//                System.out.println(list);

//                int counter = 0;
//                for (Integer el : list) {
//                        map.put(counter,el);
//                        counter++;
//                        if (el==0){
//                                map.put(0,el);
//                        } else if (el==1) {
//                                     map.put(1,el);
//                        }else if (el==2) {
//                                     map.put(2,el);
//                        }else if (el==3) {
//                                     map.put(3,el);
//                        }else if (el==4) {
//                                     map.put(4,el);
//                        }else if (el==5) {
//                                     map.put(5,el);
//                        }else if (el==6) {
//                                     map.put(6,el);
//                        }else if (el==7) {
//                                     map.put(7,el);
//                        }else if (el==8) {
//                                     map.put(8,el);
//                        }else if (el==9) {
//                                     map.put(9,el);
//                        }else if (el==10) {
//                                     map.put(10,el);
//                        }
//                }
                System.out.println(map);
                int el0=0;
                int el1=0;
                int el2=0;
                int el3=0;
                int el4=0;
                int el5=0;
                int el6=0;
                int el7=0;
                int el8=0;
                int el9=0;
                int el10=0;
                for (Integer el : map.values()) {
                        if (el==0){
                                el0++;
                        } else if (el==1) {
                                el1++;
                        }else if (el==2) {
                                el2++;
                        }else if (el==3) {
                                el3++;
                        }else if (el==4) {
                                el4++;
                        }else if (el==5) {
                                el5++;
                        }else if (el==6) {
                                el6++;
                        }else if (el==7) {
                                el7++;
                        }else if (el==8) {
                                el8++;
                        }else if (el==9) {
                                el9++;
                        }else if (el==10) {
                                el10++;
                        }
                }
                System.out.println(0+" occurs "+el0+" times");
                System.out.println(1+" occurs "+el1+" times");
                System.out.println(2+" occurs "+el2+" times");
                System.out.println(3+" occurs "+el3+" times");
                System.out.println(4+" occurs "+el4+" times");
                System.out.println(5+" occurs "+el5+" times");
                System.out.println(6+" occurs "+el6+" times");
                System.out.println(7+" occurs "+el7+" times");
                System.out.println(8+" occurs "+el8+" times");
                System.out.println(9+" occurs "+el9+" times");
                System.out.println(10+" occurs "+el10+" times");

        }
}
