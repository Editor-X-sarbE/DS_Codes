import java.util.Scanner;

public class PalindromeCheck {
    public static int reverseNum(int N) {
        int rev = 0;
        while (N > 0) {
            int dig = N % 10;
            rev = rev * 10 + dig;
            N /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int N) {
        if (N < 0) {
            return false;
        }
        return N == reverseNum(N);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        
        try {
            int N = scanner.nextInt();
            if (isPalindrome(N)) {
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
