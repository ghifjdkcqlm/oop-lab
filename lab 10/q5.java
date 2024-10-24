import java.util.Scanner;

class InvalidMatrixException extends Exception {
    public InvalidMatrixException(String message) {
        super(message);
    }
}

public class SquareMatrixValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input the size of the matrix
            System.out.print("Enter the number of rows for the matrix: ");
            int rows = scanner.nextInt();

            // Initialize the matrix
            int[][] matrix = new int[rows][];

            // Input the matrix elements
            for (int i = 0; i < rows; i++) {
                System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
                int cols = scanner.nextInt();

                // Check if the number of columns is valid
                if (cols != rows) {
                    throw new InvalidMatrixException("Invalid matrix: Row " + (i + 1) + " does not have " + rows + " columns.");
                }

                matrix[i] = new int[cols]; // Initialize the row with the specified number of columns

                System.out.println("Enter elements for row " + (i + 1) + ": ");
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Check if the matrix is a square matrix
            if (isSquareMatrix(matrix)) {
                System.out.println("The matrix is a square matrix.");
            } else {
                System.out.println("The matrix is not a square matrix.");
            }

        } catch (InvalidMatrixException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }

    // Method to check if the matrix is square
    private static boolean isSquareMatrix(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            if (matrix[i].length != size) {
                return false; // If any row does not have the same number of columns as the number of rows, it's not square
            }
        }
        return true; // All rows have the same length as the number of rows
    }
}
