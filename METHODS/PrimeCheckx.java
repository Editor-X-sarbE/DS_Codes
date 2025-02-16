import java.util.Scanner;

public class PrimeCheckx {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        
        try {
            int N = scanner.nextInt();
            System.out.println("Is " + N + " prime?");
            if (isPrime(N)) {
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
