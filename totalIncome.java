import java.util.Scanner;

public class totalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	final int PriceClassA = 20;
	final int PriceClassB = 15;
	final int PriceClassC = 10;
	final int PriceClassD = 5;

	//tickets sold for each class
	System.out.println("Enter number of Class A tickets sold: ");
	int ticketsA = sc.nextInt();
	System.out.println("Enter number of Class B tickets sold: ");
	int ticketsB = sc.nextInt();
	System.out.println("Enter number of Class C tickets sold: ");
	int ticketsC = sc.nextInt();
	System.out.println("Enter number of Class D tickets sold: ");
	int ticketsD = sc.nextInt();

	//income from each class
	int incomeA = ticketsA * PriceClassA;
	int incomeB = ticketsB * PriceClassB;
	int incomeC = ticketsC * PriceClassC;
	int incomeD = ticketsD * PriceClassD;

	//total income
	int totalIncome = incomeA + incomeB + incomeC + incomeD;
	
	//output
	System.out.println("Class A income: $" + incomeA);
	System.out.println("Class B income: $" + incomeB);
	System.out.println("Class C income: $" + incomeC);
	System.out.println("Class D income: $" + incomeD);

	System.out.println("totalIncome: $" + totalIncome);
	sc.close();
	}
}