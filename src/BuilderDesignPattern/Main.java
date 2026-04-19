package BuilderDesignPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullDish = scanner.nextLine();
        String sideDish = scanner.nextLine();
        String drink = scanner.nextLine();
        String dessert = scanner.nextLine();
        String appetizer = scanner.nextLine();



        Meal meal = new MealBuilder(fullDish, sideDish, drink)
                .setDessert(dessert)
                .setAppetizer(appetizer)
                .builder();

        meal.printMenu();

        String fullDish2 = scanner.nextLine();
        String sideDish2 = scanner.nextLine();
        String drink2 = scanner.nextLine();

        Meal meal1 = new MealBuilder(fullDish2, sideDish2, drink2).builder();

        meal1.printMenu();
    }

}
