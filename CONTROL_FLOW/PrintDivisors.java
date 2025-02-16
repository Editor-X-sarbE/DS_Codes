import java.util.Scanner;

public class PrintDivisors {
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find its divisors:");
        
        try {
            int n = scanner.nextInt();
            System.out.print("The divisors of " + n + " are: ");
            printDivisors(n);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
