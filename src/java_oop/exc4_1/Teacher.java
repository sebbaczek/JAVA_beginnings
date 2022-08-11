package java_oop.exc4_1;

import java.util.Arrays;

public class Teacher extends Person implements Examiner {
        private String correct;
        private String[][] test = exam();
//        String[][] tablec;
        public String[][] getTest() {

                return test;
        }

        public Teacher(String name, String surname) {
                super(name, surname);

        }
        public static String[][] correctTable2 = new String[][]  {{"","","","","","","","","",""},{"","","","","","","","","",""}};
        @Override
        public String[][] exam(){
                test = new String[][]{
                        testing(3, "Jaki jest kot?", "question 1."),
                        testing(3, "Jaki jest pies?", "question 2."),
                        testing(3, "Jaki jest ¿ó³w?", "question 3."),
                        testing(3, "Jaki jest byk?", "question 4."),
                        testing(3, "Jaki jest lew?", "question 5.")
                };

                return test;
        }

//        private String[][] correcttable(boolean sign) {
//                return correctTable2;
//        }

        @Override
        public String[][] makingExam(int answersNumber, String question, String questionName) {
                String[][] questionDone = makeQuestion(answersNumber,question,questionName);
                return questionDone;
        }
        int points;
        @Override
        public String[] check(String[] studentsAnswers, Student student) {
//                Student student = new Student("Marek","Markowski");
//                String[][]correcttable2;
                int index = 1;
                String[] studentAnswers = student.studentAnswers;
               String[] correcttable = {"a","b","c","a","a"};
               points = 0;
                for (int i = 0; i < studentAnswers.length; i++) {
//                        System.out.println(tablec[i][1]+"wynik");
                        if (correcttable[i].equals(studentAnswers[i])){
                                points++;
                        }
                }

                String name = student.getName();
                String surname = student.getSurname();
                switch (points){
                        case 0: case 1: index=1;break;
                        case 2: index=2;break;
                        case 3: index=3;break;
                        case 4: index=4;break;
                        case 5: index=5;break;
                        default:index=1;
                }
                return new String[]{name,surname, Integer.toString(points),Integer.toString(index)};
        }

         String[] correctTable;


        public String[] getcorrectTable() {
                return correctTable;
        }

        public String[] testing(int answersNumber, String question, String questionName) {
                 String[][] questionTest = this.makingExam(answersNumber,question,questionName);
//                 System.out.println(Arrays.toString(questionTest[1]));
              int testLength = questionTest[0][0].length()+2;
//                System.out.println(questionTest[0].length);
                 String[] questionTestTable = new String[testLength];
                questionTestTable[0] = questionTest[1][1];
                questionTestTable[1] = questionTest[1][0];
                for (int i = 0; i < questionTest[0].length; i++) {
                        questionTestTable[i] = questionTest[0][i];
                }
//                System.out.println(Arrays.toString(correctTable2[0]));
//                String[][] tablec =  makeCorrectTable2(questionTest[1][1], questionTest[1][2],correctTable2);
//                System.out.println(tablec+"tablec");

//                System.out.println(Arrays.toString(questionTestTable[0]));
                return questionTestTable;
        }
//        public int correctTableCounter2 = 0;

//        String[][] correctTable2;

//        private String[][] makeCorrectTable2(String s, String s1, String[][] correctTable2) {
////                System.out.println(s+""+s1);
////                System.out.println(correctTable2[0][1]);
////                System.out.println(Arrays.toString(correctTable2));
//                if(s.equals("question 1.")){
//                        correctTable2[0][0] = s;
//                        correctTable2[1][0] = s1;
//                } else if (s.equals("question 2.")) {
//                        correctTable2[0][1] = s;
//                        correctTable2[1][1] = s1;
//                }else if (s.equals("question 3.")) {
//                        correctTable2[0][2] = s;
//                        correctTable2[1][2] = s1;
//                }else if (s.equals("question 4.")) {
//                        correctTable2[0][3] = s;
//                        correctTable2[1][3] = s1;
//                }else if (s.equals("question 5.")) {
//                        correctTable2[0][4] = s;
//                        correctTable2[1][4] = s1;
//                }
//
//
//                System.out.println(Arrays.toString(correctTable2[0]));
//                System.out.println(Arrays.toString(correctTable2[1]));
//                return correctTable2;
//
////                System.out.println(correctTable2[correctTableCounter2][0]);
////                System.out.println(correctTable2[correctTableCounter2][1]);
////                correctTableCounter2++;
//        }


        private String[][] makeQuestion(int answersNumber, String question, String questionName){
                answers = switchMethod(answersNumber);
                String[][] res = {answers, {question, questionName}};
                correct = tossmethod(0, res[0].length);
                String[][] res1 = {answers, {question, questionName,correct}};
                correctTable= new String[]{questionName,correct};
                addcorrect(correctTable);

                 return res1;
        }
        public int correctTableCounter = -1;
        private void addcorrect(String[] correctTable) {
                correctTableCounter++;
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
                        case 3:
                                return correctanswer = "d";
                        case 4:
                                return correctanswer = "e";
                        case 5:
                                return correctanswer = "f";
                        default:
                                return correctanswer = null;
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
