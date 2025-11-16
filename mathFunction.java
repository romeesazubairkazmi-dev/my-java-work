public class mathFunction{
	public static void main(String [] args){
		System.out.printf("Degrees\t" + "Radians\t" + "Sines\t" + "Cosines\t" + "Tangents\n");
		int degrees = 30;
		double radians = Math.toRadians(degrees);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		System.out.print(degrees);
		System.out.printf("\t%1.4f\t", radians);
		System.out.printf("%1.4f\t", sin);
		System.out.printf("%1.4f\t", cos);
		System.out.printf("%1.4f\t", tan);
		System.out.print("\n");

		degrees = 60;
		radians = Math.toRadians(degrees);
		sin = Math.sin(radians);
		cos = Math.cos(radians);
		tan = Math.tan(radians);
		System.out.print(degrees);
		System.out.printf("\t%1.4f\t", radians);
		System.out.printf("%1.4f\t", sin);
		System.out.printf("%1.4f\t", cos);
		System.out.printf("%1.4f\t", tan);
		}
	}