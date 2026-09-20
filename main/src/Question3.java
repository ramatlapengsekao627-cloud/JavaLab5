/*24019362
 * Sekao Ramatlapeng
 * Lab 5 Question 3*/

/*Write a program called Question3.java that creates two Book objects with
different details, then prints each one's title, author, and price to the console.*/

public class Question3 {
    public static void main(String[] args) {

        // create two Book objects with different details
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 15.99);
        Book book2 = new Book("1984", "George Orwell", 12.50);

        // print each book's details
        System.out.println("Title: " + book1.title + ", Author: " + book1.author + ", Price: " + book1.price);
        System.out.println("Title: " + book2.title + ", Author: " + book2.author + ", Price: " + book2.price);
    }
}
