public class Staircase {
    public static void staircase(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = n - 1; j < i + n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
