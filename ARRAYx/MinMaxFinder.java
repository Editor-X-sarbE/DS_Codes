import java.util.Scanner;

class MinMaxPair {
    int min;
    int max;
}

public class MinMaxFinder {
    public static MinMaxPair getMinMax(int[] arr, int n) {
        MinMaxPair minmax = new MinMaxPair();
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (int i = 2; i < n; i++) {
            if (arr[i] > minmax.max)
                minmax.max = arr[i];
            else if (arr[i] < minmax.min)
                minmax.min = arr[i];
        }
        return minmax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            MinMaxPair minmax = getMinMax(arr, n);
            System.out.println("Minimum element is " + minmax.min);
            System.out.println("Maximum element is " + minmax.max);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}