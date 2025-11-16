import java.util.Scanner;

public class hoursMinutesCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Number of minutes passed since midnight N : ");
	int N = sc.nextInt();
	int hours = (N / 60);
	int minutes = (N % 60);
	System.out.println(hours + " " + minutes);
	sc.close();
	}
}
	