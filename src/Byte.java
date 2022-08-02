public class Byte {
    public static void main(String[] args) {
        var y = 0;
        long v = 0;var z = 1.2;
        byte x = 0;
        ++x;
        y = (int) (x+x);
        v =(long) (y+y);
        z = (float) (x/2*v);
        System.out.println(x+" "+y+" "+v+" "+z+"");
    }


}