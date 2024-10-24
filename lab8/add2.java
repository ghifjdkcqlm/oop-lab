// Interface for shape
interface Shape {
    double area();
}

// Square class implementing Shape interface
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side; // Area of square = side²
    }
}

// Triangle class implementing Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height; // Area of triangle = 1/2 * base * height
    }
}

// Main class to demonstrate area calculation
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape square = new Square(4); // Side length of square
        Shape triangle = new Triangle(5, 3); // Base and height of triangle

        System.out.println("Area of Square: " + square.area());
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
