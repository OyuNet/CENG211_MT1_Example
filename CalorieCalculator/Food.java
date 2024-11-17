package CalorieCalculator;

public abstract class Food implements Edible {

    private final int calories;

    public Food(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return this.calories;
    }
}
