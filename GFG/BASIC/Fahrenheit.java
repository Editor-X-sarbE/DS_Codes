import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter temperature in Celsius: ");
            float celsius = sc.nextFloat();
            float fahrenheit = (celsius * 1.8f) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } finally {
            sc.close();
        }
    }
}