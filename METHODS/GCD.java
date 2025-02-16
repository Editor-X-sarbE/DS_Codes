import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        int result = (a < b) ? a : b;
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("GCD of " + a + " and " + b + " is " + gcd(a, b));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }
        
        scanner.close();
    }
}
