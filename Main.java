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

        // TODO Voor degene die dit gaat reviewen: ik ben vergeten het project in een aparte branch uit te werken, en heb deze branch daarom juist aangemaakt ahahah het is dus normaal dat er geen verschil is tussen de branch en main, behalve natuurlijk deze text. Sorry voor de verwarring!

    }
}