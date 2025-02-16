import java.util.Scanner;

public class Factorial {
    public static int factorial(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + N + " is " + factorial(N));
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
        
        scanner.close();
    }
}