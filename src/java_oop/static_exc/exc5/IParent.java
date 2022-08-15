package java_oop.static_exc.exc5;

public interface IParent {
        default String getName() {
                return null;
        }

        static String getClassName() {
                return null;
        }
}
