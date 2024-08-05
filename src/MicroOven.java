public class MicroOven {
    // Method to cook a recipe
    public void cookRecipe(Recipe recipe) {
        System.out.println("Starting to cook " + recipe.getName() + " in the Micro Oven.");
        recipe.getReady();
        recipe.doTheDish();
        recipe.cleanup();
        System.out.println(recipe.getName() + " is ready!");
    }

    // Main method to demonstrate cooking a recipe
    public static void main(String[] args) {
        // Create a new Recipe object
        Recipe myRecipe = new Recipe("Pizza");

        // Create a MicroOven object
        MicroOven myOven = new MicroOven();

        // Cook the recipe
        myOven.cookRecipe(myRecipe);
    }
}
