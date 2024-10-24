import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a StringBuilder to hold the concatenated string
        StringBuilder concatenatedString = new StringBuilder();
        
        // Accept five strings from the user
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            System.out.print("String " + (i + 1) + ": ");
            String input = scanner.nextLine();
            concatenatedString.append(input); // Append each string to the StringBuilder
        }
        
        // Display the concatenated result
        System.out.println("Concatenated String: " + concatenatedString.toString());
        
        // Close the scanner
        scanner.close();
    }
}
