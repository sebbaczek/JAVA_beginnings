package java_oop.exc4;

public class Teacher extends Person implements Examiner {
        private String correct = tossmethod(0, 2);

        public Teacher(String name, String surname) {
                super(name, surname);

        }

        @Override
        public void makeQuestion(int answersNumber, String question, String questionName) {
                makingExam(answersNumber,question,questionName);
        }
        private void makingExam(int answersNumber, String question, String questionName){
                new Exam(answersNumber,question,questionName);
        }


        private String tossmethod(int min, int max) {
                String correctanswer;
                int number = getRandomNumber(min, max);
                switch (number) {
                        case 0:
                                return correctanswer = "a";
                        case 1:
                                return correctanswer = "b";
                        case 2:
                                return correctanswer = "c";
                        default:
                                return correctanswer = "a";
                }
        }
        private int getRandomNumber(int min, int max) {
                return (int) ((Math.random() * (max - min)) + min);
        }


}
