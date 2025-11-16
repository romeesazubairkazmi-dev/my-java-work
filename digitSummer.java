import java.util.Scanner;

public class digitSummer {
    public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number between 0 and 1000");
	 int num = sc.nextInt();

	 int ones = num % 10;
	 int tens = (num / 10) % 10;
	 int hundreds = ( num/100) % 10 ;
	 int sum = ones + tens + hundreds;
	
	 System.out.println("The sum of digits is: " + sum );
	 }
}