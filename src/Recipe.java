public class Recipe {
    // Instance variables
    private String name;

    // Constructor
    public Recipe(String name) {
        this.name = name;
    }

    // Method to get ready
    public void getReady() {
        System.out.println("Getting ingredients ready for " + name + ".");
    }

    // Method to do the dish
    public void doTheDish() {
        System.out.println("Cooking the " + name + ".");
    }

    // Method to cleanup
    public void cleanup() {
        System.out.println("Cleaning up after making " + name + ".");
    }

    // Getter for the name of the recipe
    public String getName() {
        return name;
    }
}
