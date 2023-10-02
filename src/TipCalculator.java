import java.util.*;
import java.text.*;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        ArrayList<Object> fullOrder = new ArrayList<>();

        //list variables
        double itemCost;
        String food = "0";
        double total = 0;

        //printing info
        System.out.println("Welcome to a Restaurant!");
        System.out.print("How many people are you dining with?: ");
        int people = scan.nextInt();
        System.out.print("What percentage would you like to tip? (0 - 100): ");
        double tipPercentage = scan.nextDouble();
        System.out.println("------------------------");
        System.out.println("Instructions: \n1. Enter the name of the item you would like to order (Type 'Done' if you are finished ordering)");
        System.out.println("2. Enter the cost of the item you are ordering");
        scan.nextLine(); //clearing scanner

        while (!food.equals("Stop") && !food.equals("Done")) { //while loop that asks for food
            System.out.print("What would you like to order?: ");
            food = scan.nextLine();
            if (!food.equals("Stop") && !food.equals("Done")) {
                System.out.print("How much is the item you are ordering?: ");
                itemCost = scan.nextDouble();
                Order newFood = new Order(food,itemCost); //creates a new object
                fullOrder.add(newFood); //adds object
                total += itemCost; //calculates total
                scan.nextLine(); //clears scanner
            }
        }
        System.out.println("------------------------");
        //printing items ordered
        for (int i = 0; i < fullOrder.size(); i++) {
            Order newFood = (Order) fullOrder.get(i);
            System.out.println("Item #" + (i + 1) + ": " + newFood.foodName + " - $" + df.format(newFood.foodPrice));
        }
        //Calculating total tip
        double tip = (tipPercentage / 100) * total;

        //printing statements
        System.out.println("------------------------");
        System.out.println("Total bill before tip: $" + df.format(total + .005));
        System.out.println("Total tip percentage: " + df.format(tipPercentage) + "%");
        System.out.println("Total tip: $" + df.format(tip + .005));
        System.out.println("Total bill with tip: $" + df.format((total + tip) + .005));
        System.out.println("Cost per person before tip: $" + df.format(total / people + .005));
        System.out.println("Tip per person: $" + df.format(tip / people + .005));
        System.out.println("Total cost per person: $" + df.format((tip + total) / people +.005));
        System.out.println("------------------------");
    }
}
