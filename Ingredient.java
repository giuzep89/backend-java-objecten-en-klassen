import java.text.DecimalFormat;

public class Ingredient {
    private double quantity;
    private final String unit;
    private final String name;

    private double firstPart;
    private double secondPart;
    private double thirdPart;

    // Full constructor
    public Ingredient(double quantity, String unit, String name){
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }

    // Constructor without unit
    public Ingredient(double quantity, String name){
        this.quantity = quantity;
        this.name = name;
        this.unit = "";
    }
    //  Setters & Getters
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void divideInTwo (double quantity) {
        this.firstPart = quantity / 2;
        this.secondPart = firstPart;
    }

    public void divideInThree (double quantity){
        this.firstPart = quantity / 3;
        this.secondPart = firstPart;
        this.thirdPart = firstPart;
    }


    // Print ingredient
    // Decimal format is a Java Class to control how to print numbers. I used it here to let it print the double variables without the .0 at the end //
    @Override
    public String toString(){
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(this.quantity) + " " + this.unit + " " + this.name;
    }


}
