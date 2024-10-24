import java.util.Scanner;

public class StringMenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;
        int choice;

        // Menu loop
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert case (upper to lower and vice-versa)");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace substring with 'Hello'");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Compare two strings
                    System.out.print("Enter first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = scanner.nextLine();
                    System.out.println("Comparison Result: " + str1.equals(str2));
                    break;

                case 2:
                    // Convert case
                    System.out.print("Enter a string: ");
                    str1 = scanner.nextLine();
                    StringBuilder converted = new StringBuilder();
                    for (char c : str1.toCharArray()) {
                        if (Character.isUpperCase(c)) {
                            converted.append(Character.toLowerCase(c));
                        } else {
                            converted.append(Character.toUpperCase(c));
                        }
                    }
                    System.out.println("Converted String: " + converted);
                    break;

                case 3:
                    // Check for substring
                    System.out.print("Enter first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    str2 = scanner.nextLine();
                    boolean isSubstring = str1.contains(str2) || str2.contains(str1);
                    System.out.println("Is one string a substring of the other? " + isSubstring);
                    break;

                case 4:
                    // Replace substring with "Hello"
                    System.out.print("Enter first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter second string (substring to replace): ");
                    str2 = scanner.nextLine();
                    if (str1.contains(str2)) {
                        String replacedString = str1.replace(str2, "Hello");
                        System.out.println("Modified String: " + replacedString);
                    } else {
                        System.out.println("The second string is not a substring of the first.");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        // Close the scanner
        scanner.close();
    }
}
