import java.util.Scanner;

public class dollarToCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount  : ");
        double amount = sc.nextDouble();

        int cents = (int) Math.round(amount * 100); // avoid floating errors
        int dollars = cents / 100;
        cents %= 100;

        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        System.out.println("Dollars : " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes   : " + dimes);
        System.out.println("Nickels : " + nickels);
        System.out.println("Pennies : " + pennies);

        sc.close();
    }
}