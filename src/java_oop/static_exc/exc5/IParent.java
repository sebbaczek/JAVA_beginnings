package java_oop.static_exc.exc5;

public interface IParent {
        String classname = "IParent";
        static String classname2 = "IParent";
        default String getName() {
                return classname;
        }

        static String getClassName() {
                return classname2;
        }
}
