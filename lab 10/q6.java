import java.util.Scanner;

class NegativeRootException extends Exception {
    public NegativeRootException(String message) {
        super(message);
    }
}

public class NegativeRootChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input the number
            System.out.print("Enter a number to find its square root: ");
            double number = scanner.nextDouble();

            // Check for negative input
            if (number < 0) {
                throw new NegativeRootException("Cannot calculate the square root of a negative number: " + number);
            }

            // Calculate the square root
            double root = Math.sqrt(number);
            System.out.printf("The square root of %.2f is %.2f.%n", number, root);

        } catch (NegativeRootException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
