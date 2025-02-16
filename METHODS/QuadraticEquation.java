import java.util.Scanner;

public class QuadraticEquation {
    public static void findRoots(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid input! 'a' cannot be zero.");
            return;
        }
        
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));
        
        if (d > 0) {
            System.out.println("Roots are real and different:");
            System.out.println((-b + sqrt_val) / (2 * a));
            System.out.println((-b - sqrt_val) / (2 * a));
        } else if (d == 0) {
            System.out.println("Roots are real and same:");
            System.out.println(-b / (2.0 * a));
        } else {
            System.out.println("Roots are complex:");
            System.out.println((-b / (2.0 * a)) + " + i" + (sqrt_val / (2 * a)));
            System.out.println((-b / (2.0 * a)) + " - i" + (sqrt_val / (2 * a)));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c:");
        
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            findRoots(a, b, c);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }
        
        scanner.close();
    }
}
