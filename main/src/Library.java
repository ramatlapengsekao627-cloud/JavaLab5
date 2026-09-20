/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 9*/

/*Write a class called Library that has an ArrayList<Book> field, an addBook(Book b) method, and a printAllBooks() method that
prints every book currently in the library*/

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // holds all the books in the library

    // constructor initializes the empty list
    public Library() {
        books = new ArrayList<Book>();
    }

    // adds a book to the library
    public void addBook(Book b) {
        books.add(b);
    }

    // prints every book currently in the library
    public void printAllBooks() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getSummary());
        }
    }
}
