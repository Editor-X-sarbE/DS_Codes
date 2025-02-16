import java.util.Scanner;

public class ReverseDigits {
    public static int reverseDigits(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        
        try {
            int num = scanner.nextInt();
            System.out.println("Reverse is " + reverseDigits(num));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
