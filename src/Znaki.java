public class Znaki {
    public static void main(String[] args) {
        String x = "39,11,41,8,43,5,45,2,47,-1,49,-4,51,-7,53,-10,55,-13,57,-16";
        int l = x.length();
        int z =1000;
        int c =0;
        for (int i =0; i<z;i++){
            System.out.print(x.charAt(c));
            c++;
            if (i%58==0){c=0;}
        }
//        System.out.println(l);
    }
}
