import java.util.Scanner;

public class Float_mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Number : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        try {
            float f1 = Float.parseFloat(s1);
            float f2 = Float.parseFloat(s2);
            System.out.println("Multiply of the Float numbers is : " + f1 * f2);
        } catch (Exception e) {
            float result = 0, result1 = 0;
            for (char c : s1.toCharArray()) {
                result = result + c;
            }
            for (char c : s2.toCharArray()) {
                result1 = result1 + c;
            }
            float resx = result * result1;
            System.out.println(
                    "\nYou have entered String Characters : \n" + s1 + "=" + result + " , " + s2 + "=" + result1);
            System.out.println("Multiplication of the Entered String : " + resx);
        }
        sc.close();
    }
}
