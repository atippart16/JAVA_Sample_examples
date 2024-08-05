
public class Runner {
    public static void main(String[] args) {
        // Create a new Rectangle object
        Rectangle myRectangle = new Rectangle(6.0, 3.0);

        // Print the dimensions of the rectangle
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Width: " + myRectangle.getWidth());

        // Calculate and print the area of the rectangle
        double area = myRectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Modify the dimensions
        myRectangle.setLength(7.0);
        myRectangle.setWidth(8.0);

        // Print the new dimensions
        System.out.println("Updated Length: " + myRectangle.getLength());
        System.out.println("Updated Width: " + myRectangle.getWidth());

        // Calculate and print the new area
        double newArea = myRectangle.calculateArea();
        System.out.println("Updated Area of the rectangle: " + newArea);
    }
}
