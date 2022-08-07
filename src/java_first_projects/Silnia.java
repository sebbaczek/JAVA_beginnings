package java_first_projects;

public class Silnia {
      public static void main(String[] args) {
        System.out.println(silnia(6));
        int x=1,y=0;
        for(int i =1;i<20;i++){
             y = x*i;
             x = y;
            System.out.println("silnia "+i+" wynosi "+y);

        }}

        private static int silnia (int n){
            int wynik =1;
            for (int i = 1; i <=n ; i++) {
                wynik = wynik*i;
                
            }
            return wynik;
        }


    }

