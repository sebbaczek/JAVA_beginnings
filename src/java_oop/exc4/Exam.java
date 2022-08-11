package java_oop.exc4;

public class Exam {
        private String questionName = "question1";

        public Exam(int answersNumber, String question, String questionName) {
                this.questionName = questionName;
                new Question(answersNumber, question);

        }
}
