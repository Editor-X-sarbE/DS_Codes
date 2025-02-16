import java.util.Scanner;

public class FindMax {
    public static int findMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n;
        try {
            n = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                i--;
            }
        }
        scanner.close();
        System.out.println(findMax(arr, n));
    }
}
