import java.util.ArrayList;
import java.util.Random;

class Fleet {

    private ArrayList<Truck> trucks;
    private Integer priceX;
    private Integer priceY;

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
                        random.nextInt(10) * 1000,
                        random.nextInt(10) * 100
                    )
                );
        }
    }

    public void calculateTotalPrice() {
        Integer price = 0;

        for (Truck truck : trucks) {
            Integer truckPrice =
                (truck.getMass() / 1000) * priceX +
                (truck.getRoad() / 100) * priceY;

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
        switch (number) {
            case 0:
                return "Yellow";
            case 1:
                return "Green";
            case 2:
                return "Blue";
        }

        return "Undefined";
    }
}
