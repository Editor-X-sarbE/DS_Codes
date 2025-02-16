import java.util.Scanner;

public class Fibonacci {
    public static void printFib(int n) {
        if (n < 1) {
            System.out.println("Invalid Number of terms");
            return;
        }

        int prev1 = 1, prev2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                int curr = prev1 + prev2;
                prev2 = prev1;
                prev1 = curr;
                System.out.print(curr + " ");
            } else if (i == 1) {
                System.out.print(prev2 + " ");
            } else if (i == 2) {
                System.out.print(prev1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            printFib(n);
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        scanner.close();
    }
}
