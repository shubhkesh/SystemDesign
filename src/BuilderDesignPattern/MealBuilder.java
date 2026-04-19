package BuilderDesignPattern;

public class MealBuilder {

    String fullDish;
    String sideDish;
    String drink;
    String dessert;
    String appetizer;

    public MealBuilder(String fullDish, String sideDish, String drink) {
        this.fullDish = fullDish;
        this.sideDish = sideDish;
        this.drink = drink;
    }

    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MealBuilder setAppetizer(String appetizer) {
        this.appetizer = appetizer;
        return this;
    }

    public Meal builder(){
        return Meal.getInstance(this);
    }
}
