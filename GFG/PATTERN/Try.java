public class Try {

    public static void main(String[] args) {
        int x = 5;
        // int number = 1;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(" 1 ");
                } else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}