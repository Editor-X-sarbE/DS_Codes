import java.util.Scanner;

public class AlphabetDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (or press Enter to skip):");
        String userInput = scanner.nextLine();
        
        if (!userInput.isEmpty()) {
            System.out.println("You entered: " + userInput);
        }
        
        System.out.println("Alphabets from (A-Z) are:");
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        
        System.out.println("\nAlphabets from (a-z) are:");
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
        
        scanner.close();
    }
}