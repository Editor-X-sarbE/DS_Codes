import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character or a string: ");
        String input = scanner.nextLine();
        scanner.close();

        if (input.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        char ch = Character.toLowerCase(input.charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The character " + input.charAt(0) + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println("The character " + input.charAt(0) + " is a consonant.");
        } else {
            System.out.println("The character " + input.charAt(0) + " is not a letter.");
        }
    }
}
