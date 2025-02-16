import java.util.Scanner;

public class LeapYearCheck {
    public static boolean checkYear(int year) {
        if (year % 400 == 0) 
            return true;
        else if (year % 100 == 0) 
            return false;
        else if (year % 4 == 0) 
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter a year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric year.");
                scanner.next(); 
            }
        }

        if (checkYear(year)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        scanner.close();
    }
}