/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 8*/

/*Write a method called cheaperBook(Book a, Book b) that takes two Book objects and returns whichever one has the lower price.
 */

public class Question8 {
    // compares two books and returns the one with the lower price
    public static Book cheaperBook(Book a, Book b) {
        if (a.getPrice() < b.getPrice()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 15.99);
        Book book2 = new Book("1984", "George Orwell", 12.50);

        Book cheaper = cheaperBook(book1, book2);

        System.out.println("Cheaper book: " + cheaper.getSummary());
    }


}
