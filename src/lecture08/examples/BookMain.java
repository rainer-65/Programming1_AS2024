package lecture08.examples;

import java.util.ArrayList;
import java.util.Collections;

public class BookMain {

    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("3-456-123", "Java Programming", 2019));
        library.add(new Book("3-654-223", "Algorithms Unleashed", 2021));
        library.add(new Book("3-765-332", "Data Structures Explained", 2019));
        library.add(new Book("3-363-456", "Algorithms Unleashed, part 2", 2021));

        // Sort the list of books
        Collections.sort(library);

        System.out.println("Sorted List:");
        for (Book book : library) {
            System.out.println(book);
        }

    }


}


