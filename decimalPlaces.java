
public class decimalPlaces {
    public static void main(String[] args) {
	double x = 75.3987;
        double y = 982.89764;
	//2 decimal places
	System.out.printf("%.2f %n", x);
        System.out.printf("%.2f %n", y);

	//3 decimal places 
	System.out.printf("%.3f %n", x);
        System.out.printf("%.3f %n", y);
	}
}