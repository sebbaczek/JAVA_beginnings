import java.util.Arrays;

public class Tree {
    public static void main(String[] args) {

        String c = "P";
        int z =29;


        if (z%2==0) {
            int x = 2;
            int y = (z-x)/2;

            for (int t = 0; t < z; t++) {


                for (int i = 0; i < y; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print(c);
                }
                for (int k = 0; k < y; k++) {
                    System.out.print(" ");
                }
                System.out.println();
                if (y == 0) {
                    return;
                }
                ;
                x += 2;
                y--;
            }
        } else {
            int x = 1;
            int y = (z-x)/2;
            for (int t = 0; t < z; t++) {


                for (int i = 0; i < y; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print(c);
                }
                for (int k = 0; k < y; k++) {
                    System.out.print(" ");
                }
                System.out.println();
                if (y == 0) {
                    return;
                }
                x += 2;
                y--;
            }

        }
//        for (int j = 0; j < z; j++){
//            for  (int i = z-1; i >=0; i--) {
//                String[] row1 = new String[z];
//                row1[i] = c;
//                System.out.print(c);
//            }
//            System.out.println();
//            z-=2;
//        }
//        for (int j = z; j >=0; j--) {
//            for (int i = 0; i < z; i++) {
//                String[] row1 = new String[z];
//                row1[i] = c;
//                System.out.print(c);
//            }
//            System.out.println();
//            z-=2;
//        }
//        System.out.println(Arrays.toString(row1));
//        if (z%2==0) {
//            for(int j = 0; j< z; j+=2){
//                for (int i = 0; i < z; i+=4) {
//                System.out.print(c+c);
//                i++;
//            }
//                System.out.println();
//
//            }
//        }else{
//            for (int i = 0; i < z; i++) {
//
//            }
//        }
    }
}
