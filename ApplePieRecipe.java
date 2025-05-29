import java.util.ArrayList;

public class ApplePieRecipe {
    private Ingredient ingredient;
    ArrayList<Ingredient> ingredientsList;

    public ApplePieRecipe() {
    }

    public void printListOfIngredients(){
        Ingredient roomboter = new Ingredient(200, "gram", "roomboter");
        System.out.println("- " + roomboter.toString() + ";");
        Ingredient basterdSuiker = new Ingredient(200, "gram", "witte bastard zuiker");
        System.out.println("- " + basterdSuiker.toString() + ";");
        Ingredient bakMeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        System.out.println("- " + bakMeel.toString() + ";");
        Ingredient ei = new Ingredient(1, "ei");
        System.out.println("- " + ei.toString() + ";");
        Ingredient vanilleSuiker = new Ingredient(8, "gram", "vanillesuiker");
        System.out.println("- " + vanilleSuiker.toString() + ";");
        Ingredient zout = new Ingredient(1, "snuf", "zout");
        System.out.println("- " + zout.toString() + ";");
        Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
        System.out.println("- " + appels.toString() + ";");
        Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
        System.out.println("- " + kristalSuiker.toString() + ";");
        Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
        System.out.println("- " + kaneel.toString() + ";");
        Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");
        System.out.println("- " + paneermeel.toString() + ";");
    }





}