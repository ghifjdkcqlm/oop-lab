import java.util.Scanner;

class Student {
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    // Constructor
    public Student(String registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    // Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "Registration Number: " + registrationNumber +
               ", First Name: " + firstName +
               ", Last Name: " + lastName +
               ", Degree: " + degree;
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 10 students
        Student[] students = new Student[10];
        students[0] = new Student("1001", "John", "Doe", "Computer Science");
        students[1] = new Student("1002", "Jane", "Smith", "Mathematics");
        students[2] = new Student("1003", "Emily", "Johnson", "Physics");
        students[3] = new Student("1004", "Michael", "Brown", "Chemistry");
        students[4] = new Student("1005", "Mary", "Davis", "Biology");
        students[5] = new Student("1006", "James", "Garcia", "English");
        students[6] = new Student("1007", "Linda", "Martinez", "History");
        students[7] = new Student("1008", "Robert", "Hernandez", "Art");
        students[8] = new Student("1009", "Patricia", "Lopez", "Philosophy");
        students[9] = new Student("1010", "David", "Wilson", "Economics");

        // Search for a student
        System.out.print("Enter first name or last name to search: ");
        String searchTerm = scanner.nextLine();
        boolean found = false;

        // Search through the array
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(searchTerm) || 
                student.getLastName().equalsIgnoreCase(searchTerm)) {
                System.out.println("Student found: " + student);
                found = true;
                break; // Stop searching after finding the first match
            }
        }

        if (!found) {
            System.out.println("No student found with that name.");
        }

        // Close the scanner
        scanner.close();
    }
}
