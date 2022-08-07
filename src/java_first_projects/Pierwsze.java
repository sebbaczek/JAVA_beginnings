package java_first_projects;

public class Pierwsze {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(3);
        for (int i = 2; i <10000 ; i++) {
            for (int j = 2; j <=i/2 ; j++) {

               if (i%j==0){
                    break;
               } else {

                   if (j !=i/2){
                       continue;
                   }else {
                       System.out.println(i);
                       break;
                   }
               }
            }

        }
    }
}
