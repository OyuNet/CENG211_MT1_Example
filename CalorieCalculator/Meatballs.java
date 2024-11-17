package CalorieCalculator;

class Meatballs extends Food {

    public Meatballs() {
        super(750);
    }

    @Override
    public int calculateCalorie() {
        return getCalories();
    }
}
