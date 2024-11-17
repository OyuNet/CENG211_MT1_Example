package CalorieCalculator;

abstract class Meal implements Edible, Comparable<Meal> {

    @Override
    public int compareTo(Meal other) {
        return Integer.compare(
            this.calculateCalorie(),
            other.calculateCalorie()
        );
    }
}
