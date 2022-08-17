package java_oop.static_exc.exc5;

public class AnotherChild implements IParent{
        private String classname = "AnotherChild";
        static String classname2 = "AnotherChild";

        @Override
        public String getName() {
                return classname;
        }

        static String getClassName(){
                return classname2;
        };
}
