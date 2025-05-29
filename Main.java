import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ApplePieRecipe recipe = new ApplePieRecipe();

        System.out.println("Ingredienten:");
        System.out.println();


        recipe.printListOfIngredients();

        System.out.println();
        System.out.println("Stappen: ");
        System.out.println();

        recipe.printDirections();

    }
}