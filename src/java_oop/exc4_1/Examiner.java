package java_oop.exc4_1;

public interface Examiner {
        String[][] makingExam(int answersNumber, String question, String questionName);
        String[] check(String[] studentsAnswers, Student student);
        String[][] exam();
}
