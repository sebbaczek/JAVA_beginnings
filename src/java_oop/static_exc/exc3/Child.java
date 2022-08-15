package java_oop.static_exc.exc3;

public class Child extends AParent {
        private String classname = "Child";
        static String classname2 = "Child";

        @Override
        public String getName() {
                return classname;
        }

        static String getClassName(){
                return classname2;
        };
}
