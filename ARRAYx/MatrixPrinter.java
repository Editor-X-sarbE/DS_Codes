import java.util.Scanner;

public class MatrixPrinter {
    private static final int N = 3;

    public static void print(int[][] arr, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[N][N];
        
        System.out.println("Enter " + (N * N) + " integers:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                try {
                    arr[i][j] = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                    j--;
                }
            }
        }
        scanner.close();
        print(arr, N);
    }
}