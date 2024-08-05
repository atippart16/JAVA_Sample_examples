
public class Fan {
    // Instance variables
    private String color;
    private String dimension;
    private boolean isOn;

    // Constructor
    public Fan(String color, String dimension) {
        this.color = color;
        this.dimension = dimension;
        this.isOn = false; // Default state is off
    }

    // Method to turn the fan on
    public void turnOn() {
        this.isOn = true;
    }

    // Method to turn the fan off
    public void turnOff() {
        this.isOn = false;
    }

    // Method to check if the fan is on
    public boolean isOn() {
        return this.isOn;
    }

    // Method to get the fan's color
    public String getColor() {
        return this.color;
    }

    // Method to get the fan's dimension
    public String getDimension() {
        return this.dimension;
    }

    // Method to print the fan's specifications
    public void printSpecifications() {
        System.out.println("Fan Specifications:");
        System.out.println("Color: " + this.color);
        System.out.println("Dimension: " + this.dimension);
        System.out.println("Is the fan on? " + (this.isOn ? "Yes" : "No"));
    }

    // Main method to demonstrate the Fan class
    public static void main(String[] args) {
        // Create a new Fan object
        Fan myFan = new Fan("White", "10 inches");

        // Print the specifications of the fan
        myFan.printSpecifications();

        // Turn the fan on
        myFan.turnOn();

        // Print the state of the fan
        System.out.println("Is the fan on? " + myFan.isOn());

        // Turn the fan off
        myFan.turnOff();

        // Print the state of the fan
        System.out.println("Is the fan on? " + myFan.isOn());
    }
}
