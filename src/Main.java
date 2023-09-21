import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tip Calculator!");

        System.out.println("How many people are you dining with?: ");
        int people = scan.nextInt();
        System.out.println("What's the tip percentage? (0 - 100): ");
        double tipPercentage = scan.nextDouble();
        System.out.println("------------------------");
        double itemCost = 0;
        double total = 0;

        while (itemCost != -1) {
            System.out.println("Enter an items cost (-1 to end) : ");
            itemCost = scan.nextDouble();
            total += itemCost;
        }
    }
}