package java_oop.exc4;

/**
 * Napisz program, kt�ry odwzoruje relacje jakie mog� wyst�powa� na uczelni mi�dzy studentem, nauczycielem i egzaminem z pytaniami. Najpierw egzamin jest tworzony przez nauczyciela, kt�ry tworzy np. 5 pyta�, o jakiej� tre�ci i 3 odpowiedziach, z czego tylko jedna jest poprawna. Ka�de pytanie ma zapisan� poprawn� odpowied� i to ustala nauczyciel. Tylko nauczyciel mo�e t� warto�� odczyta� (enkapsulacja). Nast�pnie nauczyciel rozdaje taki egzamin swoim trzem studentom i ka�dy z nich odpowiada na pytania (podczas tworzenia studenta zdefiniuj, na kt�re pytanie odpowie poprawnie lub poszukaj w internecie jak wylosowa� warto�� z podanego przedzia�u). Po udzieleniu odpowiedzi, studenci przekazuj� pytania do nauczyciela, kt�ry egzaminy sprawdza i ocenia razem z okre�leniem kto jak� dosta� ocen�. Zapewnij, aby student nie m�g� odwo�a� si� do informacji, kt�rych nie powinien zobaczy� (tzn. nie m�g� dosta� si� do warto�ci, kt�ra odpowied� w danym pytaniu jest poprawna). Napisz to tak, aby klasa studenta oraz klasa nauczyciela mog�y wsp�dzieli� te same cechy (pokazywa�em mechanizmy jak to osi�gn��). Zdefiniuj r�wnie� interfejsy Examinated oraz Examiner, w kt�rych b�dzie okre�lone, co musz� by� w stanie zrobi� egzaminator (np. stworzy� egzamin, albo dokona� jego oceny) oraz osoba egzaminowana (np. napisa� egzamin). Do ka�dego kroku dodaj drukowanie na ekranie, kt�re poka�e jakie kroki s� wykonywane w danym momencie, przyk�adowo tak jak poni�ej np. Creating teacher: Nauczyciel Nauczycielski
 */
public class exc4 {
        public static void main(String[] args) {
//                Teacher teacher = new Teacher("Jacek", "Jackowski");
//                teacher.makeQuestion(3, "Jaki jest kot?","question 1.");
//                teacher.makeQuestion(3, "Jaki jest pies?","question 2.");
//                teacher.makeQuestion(3, "Jaki jest ��w?","question 3.");
//                teacher.makeQuestion(3, "Jaki jest byk?","question 4.");
//                teacher.makeQuestion(3, "Jaki jest lew?","question 5.");
                exercise4();
        }

        private static void exercise4() {
                Examiner teacher = new Teacher("Jan", "Nowak");
        }

        Examinated[] students = new Student[]{
                new Student("Jacek", "Placek"),
                new Student("Wacek", "Zacek"),
                new Student("Kuba", "Pilka")
        };
        Exam[] exams = teacher.createExams(students.length);
        for( int i = 0; i<students.lenght; i++) {
                students[i].writeExam(exams[i]);
        }

        teacher.evaluateExams(exams);
   }
}
