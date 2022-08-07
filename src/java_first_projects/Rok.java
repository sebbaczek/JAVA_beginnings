package java_first_projects;

public class Rok {
    public static void main(String[] args) {
        int rok =2000;
        if ((rok%4==0)&& (!(rok%100==0)|| !(rok%400==0))){
            System.out.println("jest przestêpny");
        } else {
            System.out.println("nie jest przestêpny");
        }
    }
}
