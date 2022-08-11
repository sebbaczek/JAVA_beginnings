package java_oop.exc4_1;

import java.util.Arrays;

public class Student extends Person implements Examinated {

        public Student(String name, String surname) {
                super(name, surname);
        }

        Test test = new Test("Profesor","Profesorski");
        String [][] exam = test.exam();

        String [] studentAnswers = new String [5];
        @Override
        public String[] makeAnswers(String[][] test) {

                for (int i = 0; i < test.length; i++) {
                        studentAnswers[i] = tossmethod(2, test.length);

                }
                return studentAnswers;
        }
        private String tossmethod(int min, int max) {
                String answer;
                int number = getRandomNumber(min, max);
                switch (number) {
                        case 2:
                                return answer = "a";
                        case 3:
                                return answer = "b";
                        case 4:
                                return answer = "c";
                        case 5:
                                return answer = "d";
                        case 6:
                                return answer = "e";
                        case 7:
                                return answer = "f";
                        default:
                                return answer = null;
                }
        }
        private int getRandomNumber(int min, int max) {
                return (int) ((Math.random() * (max - min)) + min);
        }
}
