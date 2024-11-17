package CalorieCalculator;

class Sandwich extends Food {

    public Sandwich() {
        super(400);
    }

    @Override
    public int calculateCalorie() {
        return getCalories();
    }
}
