package lecture03.exercises;

public class Book {
    private final String ISBN;
    private String author;
    private String title;
    private int numberOfPages;
    public int inventorySize;

    public Book(String ISBN, int inventorySize) {
        this.ISBN = ISBN;
        this.inventorySize = inventorySize;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length() >= 3) this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() >= 3) this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages >= 10) this.numberOfPages = numberOfPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public void buyBook(int amount) {
        inventorySize += amount;
    }

    public void sellBook(int amount) {
        if (inventorySize - amount >= 0) {
            inventorySize -= amount;
        } else System.out.println("Not so many book available on stock!");
    }
}
