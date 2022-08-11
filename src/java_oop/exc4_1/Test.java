package java_oop.exc4_1;

public class Test extends Teacher {
        static String [][] exam;

        public Test(String name, String surname) {
                super(name, surname);
                Teacher teacher = new Teacher(name, surname);
                exam = teacher.getTest();
        }
}
