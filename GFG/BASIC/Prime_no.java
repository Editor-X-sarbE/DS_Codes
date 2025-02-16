import java.util.Scanner;

public class Prime_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prime = 0;

        System.out.print("Enter a number :");
        String input = sc.nextLine();

        try {
            int no = Integer.parseInt(input);
            for (int i = 1; i <= no; i++) {
                if (no % i == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.println("prime number .");
            } else {
                System.out.println("Not a prime number .");
            }
        } catch (Exception e) {
            int result = 0;
            for (char c : input.toCharArray()) {
                result = result + c;
            }
            System.out.println("\nYou Entered a String input convert to INT :" + input + " = " + result);
            for (int i = 1; i <= result; i++) {
                if (result % i == 0) {
                    prime++;
                }
            }
            if (prime == 2) {
                System.out.println("Prime number .");
            } else {
                System.out.println("Not a prime number .");
            }
        }
        sc.close();
    }
}