package java_oop.exc4.teacher;

import java_oop.exc4.Person;
import java_oop.exc4.teacher.Exam;
import java_oop.exc4.teacher.Examiner;

public class Teacher extends Person implements Examiner {
         public Teacher(final String name, final String surname) {
                super(name, surname);
                 System.out.println("Creating teacher: "+name+" "+surname);

        }


//        private int getRandomNumber(int min, int max) {
//                return (int) ((Math.random() * (max - min)) + min);
//        }
//

        @Override
        public Exam[] createExams(int numbersOfStudents) {
                 Exam[] exams = new  Exam[numbersOfStudents];
                for (int i = 0; i < numbersOfStudents; i++) {
                        exams[i]=createExam();
                }
                System.out.println("Teacher created "+numbersOfStudents+" exams");

                return exams;
        }

        private Exam createExam() {
                 Exam exam = new Exam(5);
                 exam.addQuestion(new Question(1,"1st question content",new String[]{"1st answer","2nd answer","3rd answer"},1));
                 exam.addQuestion(new Question(2,"2nd question content",new String[]{"1st answer","2nd answer","3rd answer"},1));
                 exam.addQuestion(new Question(3,"3rd question content",new String[]{"1st answer","2nd answer","3rd answer"},0));
                 exam.addQuestion(new Question(4,"4th question content",new String[]{"1st answer","2nd answer","3rd answer"},1));
                 exam.addQuestion(new Question(5,"5th question content",new String[]{"1st answer","2nd answer","3rd answer"},1));
                 return exam;
        }

        @Override
        public void evaluateExams(Exam[] exams) {
                for (Exam exam : exams) {
                        System.out.println("Teacher evaluating "+exam.getOwner().toString()+" exam");
                        exam.calculatePoints();
                        System.out.println(exam.getOwner().toString()+" points scored: "+exam.getPointsScored());
                        System.out.println();
                }

        }
}
