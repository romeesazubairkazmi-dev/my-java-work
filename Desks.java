import java.util.Scanner;

public class Desks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter students in class A: ");
        int a = sc.nextInt();
        System.out.print("Enter students in class B: ");
        int b = sc.nextInt();
        System.out.print("Enter students in class C: ");
        int c = sc.nextInt();

        int desksA = (a + 1) / 2;
        int desksB = (b + 1) / 2;
        int desksC = (c + 1) / 2;

        int totalDesks = desksA + desksB + desksC;
        System.out.println("Minimum number of desks to buy: " + totalDesks);

        sc.close();
    }
}