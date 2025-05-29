import java.text.DecimalFormat;

public class Ingredient {
    private double quantity;
    private String unit;
    private String name;

    // Full constructor
    public Ingredient(double quantity, String unit, String name){
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }
    // Empty constructor
    public Ingredient() {
    }

    //  Setters & Getters
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }


    // Print ingredient
    // Decimal format is a Java Class to control how to print numbers. I used it here to let it print the double variables without the .0 at the end //
    @Override
    public String toString(){
        DecimalFormat format = new DecimalFormat("0.#");
        return format.format(this.quantity) + " " + this.unit + " " + this.name;
    }


}
