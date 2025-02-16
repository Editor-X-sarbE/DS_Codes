import java.util.Scanner;

public class SumOfTwoPrimes {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; ++i) {
            if (isPrime(i) && isPrime(n - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        try {
            int n = scanner.nextInt();
            if (checkSumOfTwoPrimes(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
