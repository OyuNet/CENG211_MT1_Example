package CalorieCalculator;

class Dinner extends Meal {

    private final Food soup;
    private final Food salad;
    private final Food meatballs;
    private final Food dessert;

    public Dinner(Food soup, Food salad, Food meatballs, Food dessert) {
        this.soup = soup;
        this.salad = salad;
        this.meatballs = meatballs;
        this.dessert = dessert;
    }

    @Override
    public int calculateCalorie() {
        return (
            soup.calculateCalorie() +
            salad.calculateCalorie() +
            meatballs.calculateCalorie() +
            dessert.calculateCalorie()
        );
    }
}
