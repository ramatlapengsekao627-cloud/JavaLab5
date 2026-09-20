/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 6*/

/*Write a program called Question6.java that creates an array of three
Book objects, then uses a loop to print every book'ssummary.*/

public class Question6 {
    public static void main(String[] args) {
        // creates an array of three Book objects
        Book[] books = new Book[3];
        books[0] = new Book("The Hobbit", "Mabaso Tolkien", 15.99);
        books[1] = new Book("1984", "Sekao Ram", 12.50);
        books[2] = new Book("Dune", "Bott Haram", 18.75);

        // loop through the array and print each book's summary
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getSummary());
        }
    }


}
