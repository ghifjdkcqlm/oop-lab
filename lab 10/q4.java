// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -5; // Example of invalid age
            validateAge(age); // This will trigger the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Method that throws the custom exception if the age is invalid
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 120.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}
