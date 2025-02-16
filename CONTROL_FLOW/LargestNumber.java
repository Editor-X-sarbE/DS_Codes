import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("Enter first number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next();
        }
        a = scanner.nextInt();

        System.out.print("Enter second number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next();
        }
        b = scanner.nextInt();

        System.out.print("Enter third number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            scanner.next();
        }
        c = scanner.nextInt();

        if (a >= b) {
            if (a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } else {
            if (b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
        scanner.close();
    }
}
