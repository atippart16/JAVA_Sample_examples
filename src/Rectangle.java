public class Rectangle {
    // Instance variables
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to set the length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to set the width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to get the length
    public double getLength() {
        return length;
    }

    // Method to get the width
    public double getWidth() {
        return width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }
}
