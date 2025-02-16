import java.util.Scanner;

public class MultiplicationTable {
    public static void printTable(int range, int num) {
        for (int i = 1; i <= range; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int range = 10;
        
        while (true) {
            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        
        printTable(range, num);
        scanner.close();
    }
}
