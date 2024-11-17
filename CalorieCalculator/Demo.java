package CalorieCalculator;

import java.util.ArrayList;
import java.util.Collections;

class Demo {

    public static void main(String[] args) {
        ArrayList<Meal> meals = new ArrayList<>();

        meals.add(new Snack(new Sandwich()));
        meals.add(new Snack(new Dessert()));

        meals.add(new Lunch(new Sandwich(), new Dessert()));

        meals.add(
            new Dinner(new Soup(), new Salad(), new Meatballs(), new Dessert())
        );

        int totalCalories = 0;

        for (Meal meal : meals) {
            totalCalories += meal.calculateCalorie();
        }

        System.out.println("Total calories for today: " + totalCalories);

        Meal highestCaloriedMeal = Collections.max(meals);
        System.out.println(
            "Highest caloried meal is: " +
            highestCaloriedMeal.calculateCalorie()
        );
    }
}
