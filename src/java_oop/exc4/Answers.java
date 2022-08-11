package java_oop.exc4;

public class Answers {
        private String[] answers;

      private int answersNumber;
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


        public Answers(int answersNumber) {
                this.answers = switchMethod(answersNumber);
                this.answersNumber = answersNumber;
        }
}
