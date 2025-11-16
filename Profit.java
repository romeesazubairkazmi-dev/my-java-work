import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	final double LitrePerCarton = 3.78;
	final double CostPerLitre = 0.38;
	final double ProfitPerCarton = 0.27;
	System.out.println("Enter the total amount of milk produced in litres" );
	//total amount of milk produced
	double totalMilk = sc.nextDouble();

	//number of milk cartons
	int cartons = (int) Math.round(totalMilk / LitrePerCarton );
		
	//cost of milk
	double cost = totalMilk * CostPerLitre;
	
	//profit
	double profit = cartons * ProfitPerCarton ;
 	
	//output
	System.out.println("cartons : " + cartons );
	System.out.println("cost of producing milk :$" + cost );
	System.out.println("profit for producing milk:$" + profit);
	sc.close();
	}
}