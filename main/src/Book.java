/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 1*/

/*Write a class called Book with three fields:
 title (String), author (String), and price (double). Save it as Book.java.*/

//just a class with basic fields
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getter and setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // getter and setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // getter and setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // combines title, author and price into one String
    public String getSummary() {
        return title + " by " + author + " - $" + price;
    }
}