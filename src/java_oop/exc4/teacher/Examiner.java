package java_oop.exc4.teacher;

public interface Examiner {
        Exam[] createExams(int numbersOfStudents);
        void evaluateExams(Exam[] exams);
}
