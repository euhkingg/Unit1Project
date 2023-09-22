import java.util.*;
public class TipCalculator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double itemCost = 0;
            double total = 0;
            boolean done = false;
            String food;
            ArrayList<String> foods = new ArrayList<String>();
            ArrayList<String> prices = new ArrayList<String>();

            System.out.println("Welcome to a Restaurant!");
            System.out.print("How many people are you dining with?: ");
            int people = scan.nextInt();
            System.out.print("What's the tip percentage? (0 - 100): ");
            double tipPercentage = scan.nextDouble();
            System.out.println("------------------------");
            System.out.println("Instructions: \n1. Enter the name of the item you would like to order (Type 'Done' if you are finished ordering)");
            System.out.println("2. Enter the cost of the item you are ordering");

            while (!done) {
                System.out.print("Enter your item: ");
                food = scan.nextLine();
                foods.add(food);
                scan.nextLine();
                done = Objects.equals(food, "Done");
                if (!done) {
                    System.out.print("Enter your items cost: ");
                    itemCost = scan.nextDouble();
                    total += itemCost;
                }
            }
            total ++;
            double tip = Math.round(((tipPercentage / 100) * total) * 100) / 100.0;
            System.out.println("------------------------");
            /*for (int i = 0; i < foods.size() + 1; i++) {
                System.out.println("Item #" + i + ": " + foods.get(i) + " - $" + prices.get(i));
            }*/
            System.out.println("Total bill before tip: $" + total);
            System.out.println("Total tip percentage: " + tipPercentage + "%");
            System.out.println("Total tip: $" + tip);
            System.out.println("Total bill with tip: $" + Math.round((total + tip) * 100) / 100.0);
            System.out.println("Cost per person before tip: $" + Math.round(total / people * 100) / 100.0);
            System.out.println("Tip per person: $" + Math.round(tip / people * 100) / 100.0);
            System.out.println("Total cost per person: $" + Math.round((tip + total) / people * 100) / 100.0);
            System.out.println("------------------------");
    }
}
