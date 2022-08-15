package java_oop.static_exc.exc3;

public abstract class AParent {
        private String classname = "AParent";
        static String classname2 = "AParent";
       public abstract String getName();
        static String getClassName(){return classname2;};

}
