import java.util.Scanner;

public class Integerx {

    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer :");
        String x = sc.nextLine();
        int result = 0;

        try {
            int num = Integer.parseInt(x);
            System.out.println("\nThe Entered Integer is = " + num);
        } catch (Exception e) {
            for (char c : x.toCharArray()) {
                result = result + c; // adding ASCII values
            }
            System.out.println("\n" + x + " is a String value convert in to Integer value .");
            System.out.println("Integer value: " + result);
        }
        sc.close();
    }
}