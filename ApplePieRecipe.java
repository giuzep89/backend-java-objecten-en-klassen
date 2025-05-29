import java.util.ArrayList;

public class ApplePieRecipe {
    private Ingredient ingredient;
    private Oven oven;

    // Instances of all ingredients
    Ingredient roomboter = new Ingredient(200, "gram", "roomboter");
    Ingredient basterdSuiker = new Ingredient(200, "gram", "witte bastard zuiker");
    Ingredient bakMeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilleSuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient appels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    // Constructor
    public ApplePieRecipe() {
    }

    // Method to print the list of ingredients
    public void printListOfIngredients(){

        System.out.println("- " + roomboter.toString() + ";");
        System.out.println("- " + basterdSuiker.toString() + ";");
        System.out.println("- " + bakMeel.toString() + ";");
        System.out.println("- " + ei.toString() + ";");
        System.out.println("- " + vanilleSuiker.toString() + ";");
        System.out.println("- " + zout.toString() + ";");
        System.out.println("- " + appels.toString() + ";");
        System.out.println("- " + kristalSuiker.toString() + ";");
        System.out.println("- " + kaneel.toString() + ";");
        System.out.println("- " + paneermeel.toString() + ";");
    }

    // Method to print all of the steps at once
    public void printDirections(){
        ApplePieRecipe recipe = new ApplePieRecipe();
        recipe.warmUp();
        recipe.klopEi();
        recipe.maakDeeg();
        recipe.schilAppels();
        recipe.vetVorm();
        recipe.zetDeegInVorm();
        recipe.vulVorm();
        recipe.maakDeegStrepen();
        recipe.legStrepenOpTaart();
        recipe.bestrijkTaart();
        recipe.bakTaart();
    }

    // Methods to print the SINGLE recipe steps
    public void warmUp(){
        this.oven = new Oven(170,"boven- en onderwarmte");
        System.out.println("- Verwarm de oven van te voren op " + oven.getTemperature() + " graden celsius (" + oven.getOvenSetting() + ")");
    }

    public void klopEi(){
        System.out.println("- Klop het " + ei.getName() + " los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void maakDeeg(){
        System.out.println("- Meng de " + roomboter.getName() + ", " + basterdSuiker.getName() + ", " + bakMeel.getName() + ", een helft van het " + ei.getName() + ", " + vanilleSuiker.getName() + " en een " + zout.getUnit() + " "+ zout.getName() + " tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void schilAppels(){
        System.out.println("- Schil nu de " + appels.getName() + " en snij deze in plakjes. Vermeng in een kopje de " + vanilleSuiker.getName() + " en " + kaneel.getName() + ".");
    }

    public void vetVorm(){
        System.out.println("- Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void zetDeegInVorm(){
        System.out.println("- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. " + "Strooi het " + paneermeel.getName() + " op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void vulVorm() {
        System.out.println("- Doe de helft van de " + appels.getName() + " in de vorm en strooi hier 1/3 van het " + kaneel.getName() + "-suiker mengsel overheen. Meng de andere helft van de " + appels.getName() + " met het overgebleven " + kaneel.getName() + "-suiker mengsel en leg deze in de vorm.");
    }

    public void maakDeegStrepen() {
        System.out.println("- Rol het laatste deel van het deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void legStrepenOpTaart() {
        System.out.println("- Leg de stroken kruislings op de appeltaart. Werk de rand rondom af met wat extra deegstroken.");
    }

    public void bestrijkTaart() {
        System.out.println("- Gebruik het overgebleven " + ei.getName() + " om de bovenkant van het deeg te bestrijken.");
    }

    public void bakTaart() {
        this.oven = new Oven(170, 60, "boven- en onderwarmte");
        System.out.println("- Zet de taart iets onder het midden van de oven.");
        System.out.println("- Bak de taart in " + oven.toString() + " gaar en goudbruin.");
    }


















}