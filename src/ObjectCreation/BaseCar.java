package ObjectCreation;

public class BaseCar {
    protected String brand;
    protected String model;
    protected FuelType fuel;
    protected int doorsNr;
    protected int power;
    protected float litreage;

    public enum FuelType {PETROL, DIESEL, HYBRID, ELECTRIC, UNSPECIFIED}

    @Override
    public String toString() {
        return "brand: " + brand +
                "\nmodel: " + model +
                "\nfuel: " + fuel +
                "\ndoorsNr: " + doorsNr +
                "\npower: " + power +
                "\nlitreage: " + litreage +
                "\n\n\n\n";
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
}
