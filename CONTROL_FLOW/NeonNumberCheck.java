import java.util.Scanner;

public class NeonNumberCheck {
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Neon number:");
        
        try {
            int num = scanner.nextInt();
            System.out.println(isNeonNumber(num));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
