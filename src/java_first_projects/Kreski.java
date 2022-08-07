package java_first_projects;

public class Kreski {
    public static void main(String[] args) {
        int x =100;
//        int czerwony = 1, zielony = 2, niebieski = 3, czarny = 4, ¿ó³ty = 5, br¹zowy = 6;
        if (x>=6) {
            if (x % 6 == 0) {
                System.out.println("br¹zowy");
            } else if (x % 6 == 1) {
                System.out.println("czerwony");
            } else if (x % 6 == 2) {
                System.out.println("zielony");
            } else if (x % 6 == 3) {
                System.out.println("niebieski");
            } else if (x % 6 == 4) {
                System.out.println("czarny");
            } else if (x % 6 == 5) {
                System.out.println("¿ó³ty");
            }
        }

    }

   public static void calc(double x, double y) {
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println(x/y);

    }
}