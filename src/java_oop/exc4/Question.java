package java_oop.exc4;

public class Question {
       private String question = "question";
        public Question(int answersNumber, String question) {
                this.question = question;
                Answers answers = new Answers(answersNumber);
        }
}
