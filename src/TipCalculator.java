import java.util.Scanner;
import java.util.Random;
public class TipCalculator {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tip Calculator!");
        System.out.print("How many people are you dining with?: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0 - 100): ");
        double tipPercentage = scan.nextDouble();
        System.out.println("------------------------");

        double itemCost = 0;
        double total = 0;

        while (itemCost != -1) {
            System.out.println("Enter an items cost (-1 to end) : ");
            itemCost = scan.nextDouble();
            total += itemCost;
        }
        total ++;
        double tip = (tipPercentage / 100.0) * total;
        System.out.println("------------------------");
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Total tip percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + (int)(tip * 100) / 100.0);
        System.out.println("Total bill with tip: $" + (int)((total + tip) * 100) / 100.0);
        System.out.println("Cost per person before tip: $" + (int)(total / people * 100) / 100.0);
        System.out.println("Tip per person: $" + (int)(tip / people * 100) / 100.0);
        System.out.println("Total cost per person: $" + (int)((tip + total) * 100) / 100.0);
        System.out.println("------------------------");
    }
}
