import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        
        try {
            int n = scanner.nextInt();
            if (isPrime(n)) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is NOT prime");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}