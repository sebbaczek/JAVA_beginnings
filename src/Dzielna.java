public class Dzielna {

    public static void main(String[] args) {
        int x=210;
        dziel(x);
    }

    public static void dziel (int x){
        if ((x%3==0)&&(x%7==0)) {
            System.out.println("dzieli siê przez 3 i 7");
        } else if ((x%3==0)||(x%7==0))  {
            if (x % 3 == 0) {
                System.out.println("dzieli siê przez 3");
            } else {
                System.out.println("nie dzieli siê przez 3");
            }
            if (x % 7 == 0) {
                System.out.println("dzieli siê przez 7");
            } else {
                System.out.println("nie dzieli siê przez 7");
            }
        } else {
            System.out.println("nie dzieli siê przez 3 ani 7");
        }
    }
}