import DesignPatterns.BaseCar;
import DesignPatterns.Builder.Car;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Started");

        designPatterns();
    }

    private static void designPatterns() {
        Car.Builder reusableBuilder = new DesignPatterns.Builder.Car.Builder("Dacia", "Logan"); //Builders are reusable

        DesignPatterns.Builder.Car carBuilder = new DesignPatterns.Builder.Car.Builder("Volkswagen", "Golf GTI")
                .litreage(2.0f)
                .doorsNr(5)
                .fuel(BaseCar.FuelType.PETROL)
                .power(245)
                .build();

        System.out.println(carBuilder.toString());

        DesignPatterns.Javabeans.Car carJavabeans = new DesignPatterns.Javabeans.Car("Audi", "S5");
        carJavabeans.setDoorsNr(3);
        carJavabeans.setPower(280);
    }
}
