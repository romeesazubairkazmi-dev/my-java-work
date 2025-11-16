import java.util.Scanner;

public class Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students N: ");
        int N = sc.nextInt();
        System.out.print("Enter number of apples K: ");
        int K = sc.nextInt();

        int applesPerStudent = K / N;
        int remainder = K % N;

        System.out.println("Each student gets: " + applesPerStudent);
        System.out.println("Apples remain in basket: " + remainder);

        sc.close();
    }
}