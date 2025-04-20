package ExerciseSheet1;
import java.util.Scanner;
public class PizzaDeluxeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] toppings = {"Salami", "Pineapple", "Cheese", "Spinach", "Garlic"};
        double[] prices = {1.0, 1.5, 1.0, 0.8, 0.5 };

        System.out.println("Welcome to the Pizza Deluxe Order!");
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(toppings[i] + ": " + prices[i]);
        }

        System.out.print("Chose your topping: ");
    }
}
