import java.util.ArrayList;

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> elements = new ArrayList<>();
    
    public void push(T item) {
        elements.add(item);
    }
    
    public T pop() {
        if (!elements.isEmpty()) {
            return elements.remove(elements.size() - 1);
        }
        return null;
    }
    
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

// Sample Classes
class Student {
    String name;
    Student(String name) { this.name = name; }
    public String toString() { return "Student: " + name; }
}

class Employee {
    String name;
    Employee(String name) { this.name = name; }
    public String toString() { return "Employee: " + name; }
}

// Demonstration
public class GenericStackDemo {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice"));
        studentStack.push(new Student("Bob"));
        System.out.println("Popped from Student Stack: " + studentStack.pop());

        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push(new Employee("Charlie"));
        employeeStack.push(new Employee("Diana"));
        System.out.println("Popped from Employee Stack: " + employeeStack.pop());
    }
}
