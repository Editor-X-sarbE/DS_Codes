import java.util.Scanner;

public class PowerCalculation {

    static long power(int x, int n) {
        long pow = 1;
        for (int i = 0; i < n; i++) {
            pow *= x;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter base number: ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter exponent: ");
            int n = Integer.parseInt(scanner.nextLine());

            long result = power(x, n);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integer values.");
        } finally {
            scanner.close();
        }
    }
}
