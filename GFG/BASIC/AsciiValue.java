import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        try {
            String input = sc.nextLine(); // Read full string input

            System.out.println("ASCII values of characters in the string:");
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                System.out.println(ch + " : " + (int) ch);
                // System.out.println((int) ch);
            }
        } catch (Exception e) {
            System.out.println("Unexpected Error Occured .");
        }

        sc.close();
    }
}