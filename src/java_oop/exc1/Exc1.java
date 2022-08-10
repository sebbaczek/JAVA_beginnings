package java_oop.exc1;
import java_oop.exc1.Book;

import java.util.Arrays;

/**Napisz klasę Book, która będzie posiadała numer ISBN, tytuł oraz autora. Następnie stwórz pare książek, dodaj je do tablicy, a następnie stwórz drugą tablicę, która będzie zawierała elementy z tej pierwszej, ale tylko takie, których tytuł zaczyna się na 'h'. Nie pozwól, żeby nowa tablica zawierała null. Zobaczysz to jak ją wydrukujesz*/

public class Exc1 {
        public static void main(String[] args) {
                Book book1 = new Book("koty", "Kowalski t", 3123943);
                Book book3 = new Book("kotybook3", "Kowalski m", 31284343);
                Book book2 = new Book("kotybook2", "Kowalski n", 312323343);
                Book book4 = new Book("hotybook4", "Kowalski y", 3123443);
                Book book5 = new Book("kotybook5", "Kowalski r", 312264343);
                Book book6 = new Book("hotybook6", "Kowalski r", 31213343);
                Book book7 = new Book("kotybook7", "Kowalski e", 312344503);
                Book book8 = new Book("kotybook8", "Kowalski w", 314782343);
                Book book9 = new Book("hotybook9", "Kowalski g", 312346343);
                Book book10 = new Book("kotybook10", "Kowalski s", 312321243);

                Book[] library = {book1, book3, book2, book4, book5, book6, book7, book8, book9, book10};
                int counter = 0;
                Book[] library2;
                for (Book book : library) {
                        if (book.getTitle().toLowerCase().startsWith("h")) {
                                counter++;
                        }
                }
                library2 = new Book[counter];
                for (int i = 0, j =0; i < library.length; i++) {

                        if (library[i].getTitle().toLowerCase().charAt(0)==104) {
                                library2[j] = library[i];
                                j++;
                        }
                }
                System.out.println(Arrays.toString(library2));
        }
}
