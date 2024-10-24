import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[n];

        // Accept strings from the user
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(strings);

        // Display the sorted array
        System.out.println("Strings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Close the scanner
        scanner.close();
    }
}
