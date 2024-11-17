import java.util.ArrayList;
import java.util.Random;

class Fleet {

    private ArrayList<Truck> trucks;
    private Integer priceX;
    private Integer priceY;
    private final Integer MASS_MULTIPLIER = 1000;
    private final Integer ROAD_MULTIPLIER = 100;

    public Fleet(Integer priceX, Integer priceY) {
        this.priceX = priceX;
        this.priceY = priceY;
        this.trucks = new ArrayList<>();
    }

    public void generateFleet() {
        // Static length 10
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String color = getColorFromNumber(random.nextInt(3));
            this.trucks.add(
                    new Truck(
                        i,
                        color,
                        random.nextInt(10) * MASS_MULTIPLIER,
                        random.nextInt(10) * ROAD_MULTIPLIER
                    )
                );
        }
    }

    public void calculateTotalPrice() {
        Integer price = 0;

        for (Truck truck : trucks) {
            Integer truckPrice =
                (truck.getMass() / MASS_MULTIPLIER) * priceX +
                (truck.getRoad() / ROAD_MULTIPLIER) * priceY;

            System.out.println(
                "Revenue for id: " +
                truck.getTruckId() +
                " is " +
                truckPrice +
                ". And it's color is " +
                truck.getTruckColor() +
                "."
            );

            price += truckPrice;
        }

        System.out.println("Total price is: " + price);
    }

    private String getColorFromNumber(Integer number) {
        return switch (number) {
            case 0 -> "Yellow";
            case 1 -> "Green";
            case 2 -> "Blue";
            default -> "Undefined";
        };
    }
}
