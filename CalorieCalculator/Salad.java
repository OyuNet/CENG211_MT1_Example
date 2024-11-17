package CalorieCalculator;

class Salad extends Food {

    public Salad() {
        super(250);
    }

    @Override
    public int calculateCalorie() {
        return getCalories();
    }
}
