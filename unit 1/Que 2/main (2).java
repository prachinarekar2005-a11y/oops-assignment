package Question_2;

// Question 2: Design a Book class (title, author, ISBN) and a Library class that manages a
// collection (e.g., an ArrayList) of Book objects. Implement methods in Library to
// add a new book, remove a book by ISBN, and display all available books.

import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + ISBN;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    void removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).ISBN.equals(ISBN)) {
                System.out.println("Removed: " + books.get(i).title);
                books.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\n--- Available Books ---");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book b2 = new Book("Data Structures", "Robert Lafore", "ISBN002");
        Book b3 = new Book("Clean Code", "Robert Martin", "ISBN003");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        lib.displayBooks();

        lib.removeBook("ISBN002");

        lib.displayBooks();
    }
}
