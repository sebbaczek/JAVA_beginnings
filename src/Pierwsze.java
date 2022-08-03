public class Pierwsze {
    public static void main(String[] args) {
        for (int i = 2; i <1000 ; i++) {
            for (int j = 2; j <i ; j++) {
               if (i%j==0){
                    break;
               } else {
                   if (j !=i-1){
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
