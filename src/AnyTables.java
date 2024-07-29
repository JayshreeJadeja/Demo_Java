package src;

public class AnyTables {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n \t" + i + "x" + n + "=" + n * i);
        }

        int n1 = 5;
        for (int i = n1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        int n2 = 5;
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        int rows = 5; // Number of rows in the pyramid
        for (int i = 1; i <= rows; i++) {
// Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
// Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
// Move to the next line
            System.out.println();
        }
    }


}
