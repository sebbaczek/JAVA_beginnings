package java_oop.exc4.teacher;

import java.util.Arrays;

public class Question {
        private final int id;
        private final String content;
        private final String[] possibleAnswers;
        private final int goodAnswerIndex;
        private int givenAnswerIndex;
        Question(final int id,final String content,final String[] possibleAnswers,final int goodAnswerIndex){
                this.id = id;
                this.content= content;
                this.possibleAnswers=possibleAnswers;
                this.goodAnswerIndex=goodAnswerIndex;
        }

        public String getContent() {
                return content;
        }

        public String getPossibleAnswers() {
                return Arrays.toString(possibleAnswers);
        }
        public String getPossibleAnswer(int index) {
                return possibleAnswers[index];
        }
        public int getPossibleAnswersSize() {
                return possibleAnswers.length;
        }
        public void answer(int index){
                this.givenAnswerIndex=index;
        }
        boolean isCorrectlyAnswered(){
                System.out.println(
                        "Question: "+id+ ", content:  "+content+", goodAnswerIndex:  "+goodAnswerIndex+", givenAnswerIndex:  "+givenAnswerIndex);
                        return goodAnswerIndex==givenAnswerIndex;

        }


}
