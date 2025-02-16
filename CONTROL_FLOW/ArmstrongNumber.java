import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int N) {
        int temp = N, sum = 0, K = String.valueOf(N).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, K);
            temp /= 10;
        }
        return sum == N;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int N = scanner.nextInt();
            System.out.println(isArmstrong(N) ? "Yes" : "No");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
