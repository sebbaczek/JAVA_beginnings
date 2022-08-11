package java_oop.exc4_1;

import java_oop.exc4.Exam;

public class Teacher extends Person implements Examiner {
        private String correct;

        public Teacher(String name, String surname) {
                super(name, surname);

        }

        @Override
        public String[][] makingExam(int answersNumber, String question, String questionName) {
                String[][] questionDone = makeQuestion(answersNumber,question,questionName);
                return questionDone;
        }


        private String[][] makeQuestion(int answersNumber, String question, String questionName){
                answers = switchMethod(answersNumber);
                String[][] res = {answers, {question, questionName}};
                correct = tossmethod(0, res[0].length);
                String[][] res1 = {answers, {question, questionName,correct}};
                return res1;
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
        private String[] answers;

        private String[] switchMethod (int answersNumber){
                switch (answersNumber){
                        case 2:
                                return answers = new String[]{"a", "b"};
                        case 3:
                                return answers = new String[]{"a", "b", "c"};
                        case 4:
                                return answers = new String[]{"a", "b", "c", "d"};
                        case 5:
                                return answers = new String[]{"a", "b", "c", "d", "e"};
                        case 6:
                                return answers = new String[]{"a","b", "c", "d", "e", "f"};
                        default:
                                return answers = new String[]{"a", "b", "c"};
                }
        }
}
