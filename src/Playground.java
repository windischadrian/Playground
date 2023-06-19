import DesignPatterns.BaseCar;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Started");

        DesignPatterns.Builder.Car golfGtiBuilder = new DesignPatterns.Builder.Car.Builder("Volkswagen", "Golf GTI").build();
        DesignPatterns.Builder.Car golfGtiBuilder2 = new DesignPatterns.Builder.Car.Builder("Volkswagen", "Golf GTI")
                .litreage(2.0f)
                .doorsNr(5)
                .fuel(BaseCar.FuelType.PETROL)
                .power(245)
                .build();

        System.out.println(golfGtiBuilder2.toString());

        DesignPatterns.Javabeans.Car carJavabeans = new DesignPatterns.Javabeans.Car("Audi", "S5");
        carJavabeans.setDoorsNr(3);
        carJavabeans.setPower(280);
    }
}
