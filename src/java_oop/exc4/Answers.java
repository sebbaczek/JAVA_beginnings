package java_oop.exc4;

public class Answers {
        private String[] answers = {"a", "b", "c"};
        private String correct;

        public void Answers() {
                this.answers = answers;
                this.correct = tossmethod(0, 2);
        }

        public int getRandomNumber(int min, int max) {
                return (int) ((Math.random() * (max - min)) + min);
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
}
