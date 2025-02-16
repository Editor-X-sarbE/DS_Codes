public class Hollow {
    public static void main(String[] args) {
        int x = 7, y = 10;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                // Print '*' on the boundary
                if (i == 1 || i == x || j == 1 || j == y) {
                    System.out.print(" * ");
                } else {
                    // Print space for the hollow part
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
// *  *  *  *  *
// *           *
// *           *
// *           *
// *  *  *  *  *