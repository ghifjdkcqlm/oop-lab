import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to hold student details
        String studentName;
        String rollNumber;
        double marks1 = 0, marks2 = 0, marks3 = 0;

        // Input student details
        System.out.print("Enter Student's Name: ");
        studentName = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextLine();

        // Input marks and handle NumberFormatException
        try {
            System.out.print("Enter marks for Subject 1: ");
            marks1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter marks for Subject 2: ");
            marks2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter marks for Subject 3: ");
            marks3 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values for marks.");
            scanner.close();
            return; // Exit the program
        }

        // Calculate percentage
        double totalMarks = marks1 + marks2 + marks3;
        double percentage = (totalMarks / 300) * 100;

        // Determine grade based on percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else if (percentage >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the results
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.2f, %.2f, %.2f%n", marks1, marks2, marks3);
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
