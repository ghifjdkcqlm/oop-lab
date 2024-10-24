import java.util.Scanner;

public class PhoneNumberExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the telephone number
        System.out.print("Enter the telephone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();

        // Extract the area code
        String areaCode = phoneNumber.substring(1, 4); // Extracts characters from index 1 to 3

        // Extract the first three digits and last four digits of the phone number
        String firstThreeDigits = phoneNumber.substring(6, 9); // Extracts characters from index 6 to 8
        String lastFourDigits = phoneNumber.substring(10); // Extracts characters from index 10 to the end

        // Combine the seven digits
        String sevenDigitNumber = firstThreeDigits + lastFourDigits;

        // Display the results
        System.out.println("Area Code: " + areaCode);
        System.out.println("Seven Digit Phone Number: " + sevenDigitNumber);

        // Close the scanner
        scanner.close();
    }
}
