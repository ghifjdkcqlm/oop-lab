// Define the interface
interface Product {
    String getDetails();
    double getSales();
}

// Hardware class implementing Product interface
class Hardware implements Product {
    private String category;
    private String manufacturer;
    private double sales;

    public Hardware(String category, String manufacturer, double sales) {
        this.category = category;
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    @Override
    public String getDetails() {
        return "Category: " + category + ", Manufacturer: " + manufacturer;
    }

    @Override
    public double getSales() {
        return sales;
    }
}

// Software class implementing Product interface
class Software implements Product {
    private String type;
    private String operatingSystem;
    private double sales;

    public Software(String type, String operatingSystem, double sales) {
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.sales = sales;
    }

    @Override
    public String getDetails() {
        return "Type: " + type + ", Operating System: " + operatingSystem;
    }

    @Override
    public double getSales() {
        return sales;
    }
}

// Main class to demonstrate functionality
public class CompanySales {
    public static void main(String[] args) {
        // Create hardware products
        Hardware hardware1 = new Hardware("Laptop", "Dell", 15000);
        Hardware hardware2 = new Hardware("Printer", "HP", 5000);

        // Create software products
        Software software1 = new Software("Antivirus", "Windows", 3000);
        Software software2 = new Software("Office Suite", "Cross-platform", 7000);

        // Calculate total sales
        double totalHardwareSales = hardware1.getSales() + hardware2.getSales();
        double totalSoftwareSales = software1.getSales() + software2.getSales();

        // Display details and total sales
        System.out.println("Hardware Products:");
        System.out.println(hardware1.getDetails() + ", Sales: " + hardware1.getSales());
        System.out.println(hardware2.getDetails() + ", Sales: " + hardware2.getSales());
        System.out.println("Total Hardware Sales: " + totalHardwareSales);

        System.out.println("\nSoftware Products:");
        System.out.println(software1.getDetails() + ", Sales: " + software1.getSales());
        System.out.println(software2.getDetails() + ", Sales: " + software2.getSales());
        System.out.println("Total Software Sales: " + totalSoftwareSales);
    }
}
