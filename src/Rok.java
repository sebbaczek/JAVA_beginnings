public class Rok {
    public static void main(String[] args) {
        int rok =2024;
        if ((rok%4==0)&& !(rok%100==0)){
            System.out.println("jest przest�pny");
        } else {
            System.out.println("nie jest przest�pny");
        }
    }
}
