import java.util.Scanner;

public class PrimeNumbersInRange {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bound:");

        try {
            int num1 = scanner.nextInt();
            System.out.println("Enter the upper bound:");
            int num2 = scanner.nextInt();

            System.out.print("Prime numbers between " + num1 + " and " + num2 + " are: ");
            for (int j = num1; j < num2; ++j) {
                if (isPrime(j)) {
                    System.out.print(j + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter valid integers.");
        }

        scanner.close();
    }
}
