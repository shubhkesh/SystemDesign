package BuilderDesignPattern;

public class Meal {

    String fullDish;
    String sideDish;
    String drink;
    String dessert;
    String appetizer;

    private Meal(MealBuilder mealBuilder){
        this.fullDish = mealBuilder.fullDish;
        this.sideDish = mealBuilder.sideDish;
        this.drink = mealBuilder.drink;
        this.dessert = mealBuilder.dessert;
        this.appetizer = mealBuilder.appetizer;
    }

    public static synchronized Meal getInstance(MealBuilder mealBuilder)
    {
        return new Meal(mealBuilder);
    }

    public void printMenu()
    {
        System.out.println("Full Dish:" + fullDish);
        System.out.println("Full Side Dish:" + sideDish);
        System.out.println("Full Drink:" + drink);
        System.out.println("Full Dessert:" + dessert);
        System.out.println("Full Appetizer:" + appetizer);
    }

}
