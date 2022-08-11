package java_oop.exc4_1;

import java.util.Arrays;

/**
 * Napisz program, kt�ry odwzoruje relacje jakie mog� wyst�powa� na uczelni mi�dzy studentem, nauczycielem i egzaminem z pytaniami. Najpierw egzamin jest tworzony przez nauczyciela, kt�ry tworzy np. 5 pyta�, o jakiej� tre�ci i 3 odpowiedziach, z czego tylko jedna jest poprawna. Ka�de pytanie ma zapisan� poprawn� odpowied� i to ustala nauczyciel. Tylko nauczyciel mo�e t� warto�� odczyta� (enkapsulacja). Nast�pnie nauczyciel rozdaje taki egzamin swoim trzem studentom i ka�dy z nich odpowiada na pytania (podczas tworzenia studenta zdefiniuj, na kt�re pytanie odpowie poprawnie lub poszukaj w internecie jak wylosowa� warto�� z podanego przedzia�u). Po udzieleniu odpowiedzi, studenci przekazuj� pytania do nauczyciela, kt�ry egzaminy sprawdza i ocenia razem z okre�leniem kto jak� dosta� ocen�. Zapewnij, aby student nie m�g� odwo�a� si� do informacji, kt�rych nie powinien zobaczy� (tzn. nie m�g� dosta� si� do warto�ci, kt�ra odpowied� w danym pytaniu jest poprawna). Napisz to tak, aby klasa studenta oraz klasa nauczyciela mog�y wsp�dzieli� te same cechy (pokazywa�em mechanizmy jak to osi�gn��). Zdefiniuj r�wnie� interfejsy Examinated oraz Examiner, w kt�rych b�dzie okre�lone, co musz� by� w stanie zrobi� egzaminator (np. stworzy� egzamin, albo dokona� jego oceny) oraz osoba egzaminowana (np. napisa� egzamin). Do ka�dego kroku dodaj drukowanie na ekranie, kt�re poka�e jakie kroki s� wykonywane w danym momencie, przyk�adowo tak jak poni�ej np. Creating teacher: Nauczyciel Nauczycielski
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
//                String[][] question3 = teacher.makingExam(3, "Jaki jest ��w?", "question 3.");
//                String[][] question4 = teacher.makingExam(3, "Jaki jest byk?", "question 4.");
//                String[][] question5 = teacher.makingExam(3, "Jaki jest lew?", "question 5.");
//                System.out.println(Arrays.toString(question1[0]));System.out.println(Arrays.toString(question1[1]));
//                System.out.println(Arrays.toString(question2[0]));System.out.println(Arrays.toString(question2[1]));
//                System.out.println(Arrays.toString(question3[0]));System.out.println(Arrays.toString(question3[1]));
//                System.out.println(Arrays.toString(question4[0]));System.out.println(Arrays.toString(question4[1]));
//                System.out.println(Arrays.toString(question5[0]));System.out.println(Arrays.toString(question5[1]));
        }
}
