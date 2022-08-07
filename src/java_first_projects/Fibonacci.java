package java_first_projects;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int v;
        int z = 20;
        for (int i = 0; i < z; i++) {
            System.out.print(x + " ");
            v = y + x;
            x = y;
            y = v;
        }
    }
}
