import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements in sorted order:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.print("Enter the element to search: ");
            int key = scanner.nextInt();
            int result = binarySearch(arr, 0, size - 1, key);
            if (result == -1) {
                System.out.println("Element is not present in array");
            } else {
                System.out.println("Element is present at index " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
