package CalorieCalculator;

class Snack extends Meal {

    private final Food snackItem;

    public Snack(Food snackItem) {
        this.snackItem = snackItem;
    }

    @Override
    public int calculateCalorie() {
        return snackItem.calculateCalorie();
    }
}
