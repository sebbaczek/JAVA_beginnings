public class Silnia {
    public static void main(String[] args) {
        int x=1,y=0;
        for(int i =1;i<20;i++){
             y = x*i;
             x = y;
            System.out.println("silnia "+i+" wynosi "+y);
        }
    }
}
