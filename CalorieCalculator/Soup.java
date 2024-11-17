package CalorieCalculator;

class Soup extends Food {

    public Soup() {
        super(300);
    }

    @Override
    public int calculateCalorie() {
        return getCalories();
    }
}
