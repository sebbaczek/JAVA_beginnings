package java_oop;

public class Book {
        private String title;
        private String author;
        private int isbn;

        public Book(String title, String author, int isbn) {
                this.title = title;
                this.author = author;
                this.isbn = isbn;
        }

        public String getTitle() {
                return title;
        }

        @Override
        public String toString() {
                return "Book{" +
                        "title='" + title + '\'' +
                        ", author='" + author + '\'' +
                        ", isbn=" + isbn +
                        '}';
        }
}
