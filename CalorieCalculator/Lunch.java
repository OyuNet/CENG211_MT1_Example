package CalorieCalculator;

class Lunch extends Meal {

    private final Food sandwich;
    private final Food dessert;

    public Lunch(Food sandwich, Food dessert) {
        this.sandwich = sandwich;
        this.dessert = dessert;
    }

    @Override
    public int calculateCalorie() {
        return sandwich.calculateCalorie() + dessert.calculateCalorie();
    }
}
