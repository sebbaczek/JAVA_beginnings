package java_first_projects;

public class Liczby3 {
    public static void main(String[] args) {
        int x=3,y=40,z=5;
        if ((x>y)&&(x>z)){
            System.out.println("x jest najwi�ksze");
        } else if (((y>x)&&(y>z))) {
            System.out.println("y jest najwi�ksze");
        } else {
            System.out.println("z jest najwi�ksze");
        }
    }
}
