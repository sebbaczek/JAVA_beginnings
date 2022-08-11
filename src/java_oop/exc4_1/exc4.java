package java_oop.exc4_1;

import java.util.Arrays;

/**
 * Napisz program, który odwzoruje relacje jakie mog¹ wystêpowaæ na uczelni miêdzy studentem, nauczycielem i egzaminem z pytaniami. Najpierw egzamin jest tworzony przez nauczyciela, który tworzy np. 5 pytañ, o jakiejœ treœci i 3 odpowiedziach, z czego tylko jedna jest poprawna. Ka¿de pytanie ma zapisan¹ poprawn¹ odpowiedŸ i to ustala nauczyciel. Tylko nauczyciel mo¿e tê wartoœæ odczytaæ (enkapsulacja). Nastêpnie nauczyciel rozdaje taki egzamin swoim trzem studentom i ka¿dy z nich odpowiada na pytania (podczas tworzenia studenta zdefiniuj, na które pytanie odpowie poprawnie lub poszukaj w internecie jak wylosowaæ wartoœæ z podanego przedzia³u). Po udzieleniu odpowiedzi, studenci przekazuj¹ pytania do nauczyciela, który egzaminy sprawdza i ocenia razem z okreœleniem kto jak¹ dosta³ ocenê. Zapewnij, aby student nie móg³ odwo³aæ siê do informacji, których nie powinien zobaczyæ (tzn. nie móg³ dostaæ siê do wartoœci, która odpowiedŸ w danym pytaniu jest poprawna). Napisz to tak, aby klasa studenta oraz klasa nauczyciela mog³y wspó³dzieliæ te same cechy (pokazywa³em mechanizmy jak to osi¹gn¹æ). Zdefiniuj równie¿ interfejsy Examinated oraz Examiner, w których bêdzie okreœlone, co musz¹ byæ w stanie zrobiæ egzaminator (np. stworzyæ egzamin, albo dokonaæ jego oceny) oraz osoba egzaminowana (np. napisaæ egzamin). Do ka¿dego kroku dodaj drukowanie na ekranie, które poka¿e jakie kroki s¹ wykonywane w danym momencie, przyk³adowo tak jak poni¿ej np. Creating teacher: Nauczyciel Nauczycielski
 */
public class exc4 {
        public static void main(String[] args) {
                Test test= new Test("Jacek", "Jackowski");
                String[][] test1 = test.exam;
                Student student = new Student("Marek", "Markowski");
                String[] answers = student.makeAnswers(test1);
                Teacher teacher = new Teacher(student.test.getName(),student.test.getSurname());
                System.out.println("Creating teacher: "+student.test.getName()+" "+student.test.getSurname());
                String[] answersChecked = teacher.check(answers,student);
                System.out.println(answersChecked[0]+" "+answersChecked[1]+" scored "+answersChecked[2]+" points - Index: "+answersChecked[3]);
                Student student1 = new Student("Romek", "Romarski");
                String[] answers1 = student1.makeAnswers(test1);
                Teacher teacher1 = new Teacher(student1.test.getName(),student1.test.getSurname());
                String[] answersChecked1 = teacher1.check(answers1,student1);
                System.out.println(answersChecked1[0]+" "+answersChecked1[1]+" scored "+answersChecked1[2]+" points - Index: "+answersChecked1[3]);
                Student student2 = new Student("Zenek", "Kruk");
                String[] answers2 = student2.makeAnswers(test1);
                Teacher teacher2 = new Teacher(student2.test.getName(),student2.test.getSurname());
                String[] answersChecked2 = teacher2.check(answers2,student2);
                System.out.println(answersChecked2[0]+" "+answersChecked2[1]+" scored "+answersChecked2[2]+" points - Index: "+answersChecked2[3]);



//                String[][] question1 = teacher.makingExam(3, "Jaki jest kot?", "question 1.");
//                String[][] question2 = teacher.makingExam(3, "Jaki jest pies?", "question 2.");
//                String[][] question3 = teacher.makingExam(3, "Jaki jest ¿ó³w?", "question 3.");
//                String[][] question4 = teacher.makingExam(3, "Jaki jest byk?", "question 4.");
//                String[][] question5 = teacher.makingExam(3, "Jaki jest lew?", "question 5.");
//                System.out.println(Arrays.toString(question1[0]));System.out.println(Arrays.toString(question1[1]));
//                System.out.println(Arrays.toString(question2[0]));System.out.println(Arrays.toString(question2[1]));
//                System.out.println(Arrays.toString(question3[0]));System.out.println(Arrays.toString(question3[1]));
//                System.out.println(Arrays.toString(question4[0]));System.out.println(Arrays.toString(question4[1]));
//                System.out.println(Arrays.toString(question5[0]));System.out.println(Arrays.toString(question5[1]));
        }
}
