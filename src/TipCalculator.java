import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the total bill: ");
        double totalBill = scan.nextDouble();
        System.out.print("Enter the tip percentage: ");
        int tipPercent = scan.nextInt();
        System.out.print("Enter the number of people in the party: ");
        int people = scan.nextInt();
        double tipAmount = totalBill * ((double) tipPercent / 100);
        double totalWithTip = totalBill + tipAmount;
        double tipPerPerson = tipAmount / people;
        double totalPerPerson = totalWithTip / people;
        System.out.println("The tip is: $" + tipAmount);
        System.out.println("The total bill with tip is: $" + totalWithTip);
        System.out.println("The tip per person would be: $" + tipPerPerson);
        System.out.println("The total per person with tip would be: $" + totalPerPerson);
        
    }
}
