/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 1*/

/*Write a class called Book with three fields:
 title (String), author (String), and price (double). Save it as Book.java.*/

//just a class with basic fields
public class Book {
    String title;
    String author;
    double price;

    // constructor sets all three fields when a new Book is created
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
