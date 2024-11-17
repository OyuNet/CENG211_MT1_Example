package CalorieCalculator;

class Dessert extends Food {

    public Dessert() {
        super(600);
    }

    @Override
    public int calculateCalorie() {
        return getCalories();
    }
}
