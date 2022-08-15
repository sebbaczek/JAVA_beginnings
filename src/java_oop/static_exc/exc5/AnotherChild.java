package java_oop.static_exc.exc5;

public class AnotherChild implements IParent{
        @Override
        public String getName() {
                return IParent.super.getName();
        }
        static String getClassName() {
                return null;
        }
}
