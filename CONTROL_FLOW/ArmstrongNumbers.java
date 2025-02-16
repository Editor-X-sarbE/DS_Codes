import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check for Armstrong numbers up to that limit:");
        
        try {
            int limit = scanner.nextInt();
            System.out.println("All Armstrong numbers up to " + limit + " are:");
            
            for (int i = 1; i <= limit; i++) {
                int num = i, sum = 0, count = 0;
                
                int temp = num;
                while (temp != 0) {
                    temp /= 10;
                    count++;
                }
                
                temp = num;
                while (temp != 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, count);
                    temp /= 10;
                }
                
                if (sum == i) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}
