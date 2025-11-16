import java.util.Scanner;

public class budgetCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int weeks = 5;
	double PayPerHour = 15.50;
	double TaxRate = 0.14 ;
	double ClothesRate = 0.10;
	double SuppliesRate = 0.01;
	double SavingBondRate = 0.25;
	double ParentsSavingBondRate = 0.50;
	
	System.out.println("Enter your hourly pay rate: $");
        double payRate = sc.nextDouble();
        
	System.out.println("Enter hours worked per week: ");
        double hoursPerWeek = sc.nextDouble();
	
	double incomeBefore = payRate * hoursPerWeek * weeks;
	//income after tax
	double tax = incomeBefore * TaxRate;
	double netIncome = incomeBefore - tax;
	 System.out.println("Income before tax :$" + incomeBefore + " and Income after tax :$" + netIncome);
	
	//money spend on clothes and other accessories
	double clothesMoney = netIncome * ClothesRate;
	
	//money spend on school supplies
	double suppliesMoney = netIncome * SuppliesRate;

	//remaining money 
	double remainingMoney = netIncome - ( clothesMoney + suppliesMoney);

	//money you spend to buy savings bonds
	double savingBonds = remainingMoney *  SavingBondRate;

	//money parents spend to buy additional savings bonds
	double parentsBond = savingBonds * ParentsSavingBondRate;

	//results
	System.out.println("Money spend on clothes: $" + clothesMoney);
	System.out.println("Money spend on school supplies: $" + suppliesMoney);
	System.out.println("Money spend on saving bonds: $" + savingBonds);
	System.out.println("Money spend by parents for buying additional saving bonds: $" + parentsBond);
	}
}
	
	