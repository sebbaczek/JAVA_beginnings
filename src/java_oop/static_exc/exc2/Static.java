package java_oop.static_exc.exc2;

public class Static {
        static {
                counter =1;
                System.out.println("initialize class Static");
        }
        {
                System.out.println(counter++);
//                System.out.println(this.name);
        }
       private static int counter;
        public String name;

        public Static(String name) {
                System.out.println(this.name = name);
        }
}
