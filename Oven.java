public class Oven {
    private int temperature;
    private int bakingTime;
    private String ovenSetting;

    // Constructor without baking time
    public Oven(int temperature, String ovenSetting) {
        this.temperature = temperature;
        this.ovenSetting = ovenSetting;
    }

    // Full constructor
    public Oven(int temperature, int bakingTime, String ovenSetting) {
        this.temperature = temperature;
        this.bakingTime = bakingTime;
        this.ovenSetting = ovenSetting;
    }

    // Getters
    public int getTemperature() {
        return temperature;
    }

    public String getOvenSetting() {
        return ovenSetting;
    }

    // Print oven to String
    @Override
    public String toString() {
        return this.bakingTime + " minuten op " + this.temperature + " graden Celsius (" + this.ovenSetting + ")";
    }
}
