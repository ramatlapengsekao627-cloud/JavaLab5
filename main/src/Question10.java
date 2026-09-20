/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 10*/

/*Write a class called Library that has an ArrayList<Book> field, an addBook(Book b) method, and a printAllBooks() method that
prints every book currently in the library*/

import java.util.ArrayList;

public class Question10 {
    public static void main(String[] args) {

        // create a Library object
        Library library = new Library();

        // add four Book objects using addBook()
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 15.99));
        library.addBook(new Book("1984", "George Orwell", 12.50));
        library.addBook(new Book("Dune", "Frank Herbert", 18.75));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 10.25));

        // print the full collection
        library.printAllBooks();
    }
}
