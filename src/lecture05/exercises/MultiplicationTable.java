package lecture05.exercises;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Define the size of the multiplication table (1 to 9)
        int size = 9;

        // Initialize row and column indices
        int row = 1;

        // Outer loop for rows
        while (row <= size) {
            int col = 1;  // Reset the column index for each new row

            // Inner loop for columns
            while (col <= size) {
                int product = row * col;  // Calculate the product

                // Print the product with formatted output to align the columns
                // "%4d" formats the number to be 4 characters wide (for alignment)
                System.out.printf("%4d", product);

                col++;  // Move to the next column
            }

            System.out.println();  // Move to the next line after each row
            row++;  // Move to the next row
        }
    }
}
