import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int recSum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + recSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        
        try {
            int n = scanner.nextInt();
            System.out.println("Sum = " + recSum(n));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}