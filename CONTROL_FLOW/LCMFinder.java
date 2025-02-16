import java.util.Scanner;

public class LCMFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        
        while (true) {
            try {
                System.out.print("Enter first number: ");
                x = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter second number: ");
                y = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers only.");
            }
        }
        
        int max = (x > y) ? x : y;
        
        while (true) {
            if (max % x == 0 && max % y == 0) {
                System.out.println("The LCM of " + x + " and " + y + " is " + max);
                break;
            }
            max++;
        }
        
        scanner.close();
    }
}
