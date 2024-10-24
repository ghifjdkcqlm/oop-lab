class Bike {
    protected int speedLimit = 80; // Default speed limit for Bike

    public void run() {
        System.out.println("The speed limit for Bike is: " + speedLimit + " km/h");
    }
}

class Splendor extends Bike {
    protected int speedLimit = 100; // Speed limit for Splendor

    @Override
    public void run() {
        System.out.println("The speed limit for Splendor is: " + speedLimit + " km/h");
    }
}

public class add2 {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        Bike mySplendor = new Splendor(); // Upcasting

        // Calls the run() method of Bike
        myBike.run(); 

        // Calls the overridden run() method of Splendor
        mySplendor.run(); 

        // Demonstrating access to speedLimit
        System.out.println("Speed limit accessed from Bike reference: " + myBike.speedLimit);
        System.out.println("Speed limit accessed from Splendor reference: " + mySplendor.speedLimit); // This will still show the Bike's speedLimit due to reference type
    }
}
