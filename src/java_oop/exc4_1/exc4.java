package java_oop.exc4_1;

import java.util.Arrays;

/**
 * Napisz program, który odwzoruje relacje jakie mog¹ wystêpowaæ na uczelni miêdzy studentem, nauczycielem i egzaminem z pytaniami. Najpierw egzamin jest tworzony przez nauczyciela, który tworzy np. 5 pytañ, o jakiejœ treœci i 3 odpowiedziach, z czego tylko jedna jest poprawna. Ka¿de pytanie ma zapisan¹ poprawn¹ odpowiedŸ i to ustala nauczyciel. Tylko nauczyciel mo¿e tê wartoœæ odczytaæ (enkapsulacja). Nastêpnie nauczyciel rozdaje taki egzamin swoim trzem studentom i ka¿dy z nich odpowiada na pytania (podczas tworzenia studenta zdefiniuj, na które pytanie odpowie poprawnie lub poszukaj w internecie jak wylosowaæ wartoœæ z podanego przedzia³u). Po udzieleniu odpowiedzi, studenci przekazuj¹ pytania do nauczyciela, który egzaminy sprawdza i ocenia razem z okreœleniem kto jak¹ dosta³ ocenê. Zapewnij, aby student nie móg³ odwo³aæ siê do informacji, których nie powinien zobaczyæ (tzn. nie móg³ dostaæ siê do wartoœci, która odpowiedŸ w danym pytaniu jest poprawna). Napisz to tak, aby klasa studenta oraz klasa nauczyciela mog³y wspó³dzieliæ te same cechy (pokazywa³em mechanizmy jak to osi¹gn¹æ). Zdefiniuj równie¿ interfejsy Examinated oraz Examiner, w których bêdzie okreœlone, co musz¹ byæ w stanie zrobiæ egzaminator (np. stworzyæ egzamin, albo dokonaæ jego oceny) oraz osoba egzaminowana (np. napisaæ egzamin). Do ka¿dego kroku dodaj drukowanie na ekranie, które poka¿e jakie kroki s¹ wykonywane w danym momencie, przyk³adowo tak jak poni¿ej np. Creating teacher: Nauczyciel Nauczycielski
 */
public class exc4 {
        public static void main(String[] args) {
                Teacher teacher = new Teacher("Jacek", "Jackowski");
                String[][] question1 = teacher.makingExam(3, "Jaki jest kot?", "question 1.");
                String[][] question2 = teacher.makingExam(3, "Jaki jest pies?", "question 2.");
                String[][] question3 = teacher.makingExam(3, "Jaki jest ¿ó³w?", "question 3.");
                String[][] question4 = teacher.makingExam(3, "Jaki jest byk?", "question 4.");
                String[][] question5 = teacher.makingExam(3, "Jaki jest lew?", "question 5.");
//                System.out.println(Arrays.toString(question1[0]));System.out.println(Arrays.toString(question1[1]));
//                System.out.println(Arrays.toString(question2[0]));System.out.println(Arrays.toString(question2[1]));
//                System.out.println(Arrays.toString(question3[0]));System.out.println(Arrays.toString(question3[1]));
//                System.out.println(Arrays.toString(question4[0]));System.out.println(Arrays.toString(question4[1]));
//                System.out.println(Arrays.toString(question5[0]));System.out.println(Arrays.toString(question5[1]));
        }
}
