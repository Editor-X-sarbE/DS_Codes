import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char op;
        double a, b, res = 0;

        System.out.print("Enter an operator (+, -, *, /): ");
        op = scanner.next().charAt(0);

        System.out.print("Enter two operands: ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            System.out.println("Error! Invalid input.");
            scanner.close();
            return;
        }

        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } else {
            System.out.println("Error! Invalid input.");
            scanner.close();
            return;
        }

        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Error! Division by zero.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Error! Incorrect Operator Value");
                scanner.close();
                return;
        }
        
        System.out.printf("%.2f", res);
        scanner.close();
    }
}
