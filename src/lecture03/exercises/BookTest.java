package lecture03.exercises;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ISBN: ");
        String ISBN = in.nextLine();
        System.out.println("Enter the author: ");
        String author = in.nextLine();
        System.out.println("Enter the title: ");
        String title = in.nextLine();
        System.out.println("Enter the number of pages: ");
        int numPages = in.nextInt();
        System.out.println("Enter the inventory size: ");
        int inventorySize = in.nextInt();
        in.close();

        // Create a book object and set the attributes
        Book book = new Book(ISBN, inventorySize);
        book.setAuthor(author);
        book.setTitle(title);
        book.setInventorySize(inventorySize);
        book.setNumberOfPages(numPages);

        // Book information
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("author: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("number of pages: " + book.getNumberOfPages());
        System.out.println("inventory size: " + book.getInventorySize());

        // Selling books
        book.sellBook(3);
        book.sellBook(4);
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("author: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("number of pages: " + book.getNumberOfPages());
        System.out.println("inventory size: " + book.getInventorySize());

        // Buying books
        book.buyBook(3);
        System.out.println("Book information follows:");
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("author: " + book.getAuthor());
        System.out.println("title: " + book.getTitle());
        System.out.println("number of pages: " + book.getNumberOfPages());
        System.out.println("inventory size: " + book.getInventorySize());
    }
}
