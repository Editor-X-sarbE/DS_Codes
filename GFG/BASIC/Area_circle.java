import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radious :");
        float radious = sc.nextFloat();
        try {
            System.out.println("Area of Circle = " + 3.14 * radious);
            System.out.println("Area of Peremeter = " + 2 * 3.14 * radious);
        } catch (Exception e) {
            System.out.println("Enter valid input .");
        }
        sc.close();
    }
}
