import java.util.Scanner;

public class salaryCalculator{
    public static void main(String[] args) {
        // Create Scanner object
        Scanner console = new Scanner(System.in);

        // Constants
        final int SECRET = 11;
        final double RATE = 12.50;

        // Variables
        int num1, num2, newNum;
        String name;
        double hoursWorked, wages;

        // Input integers
        System.out.print("Enter first integer: ");
        num1 = console.nextInt();
        System.out.print("Enter second integer: ");
        num2 = console.nextInt();

        // Output values
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);

        // Compute newNum
        newNum = (num1 * 2) + num2;
        System.out.println("newNum after calculation: " + newNum);

        // Update newNum with SECRET
        newNum = newNum + SECRET;
        System.out.println("newNum after adding SECRET (" + SECRET + "): " + newNum);

        // Input name
        System.out.print("Enter your last name: ");
        name = console.next();

        // Input hoursWorked
        System.out.print("Enter hours worked (0 - 70): ");
        hoursWorked = console.nextDouble();

        // Calculate wages
        wages = hoursWorked * RATE;

        // Final Output
        System.out.println("\nName: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: $" + wages);

        console.close();
    }
}
