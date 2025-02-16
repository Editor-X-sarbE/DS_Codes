import java.util.Scanner;

public class Add_2no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 values: ");
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int result = 0, result1 = 0;

        try {
            int x = Integer.parseInt(input1);
            int y = Integer.parseInt(input2);
            int sum = x + y;
            System.out.println("\nThe Result of Addition is: " + sum);
        } catch (Exception e) {
            for (char c : input1.toCharArray()) {
                result = result + c;
            }
            for (char c : input2.toCharArray()) {
                result1 = result1 + c;
            }
            int resx = result + result1;
            System.out.println("\nYou have Entered String Characters .");
            System.out.println("The Result of String Addition is: " + resx);
        }
        sc.close();
    }
}
