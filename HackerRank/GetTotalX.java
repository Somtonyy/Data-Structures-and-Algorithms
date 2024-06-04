import java.util.List;

public class GetTotalX {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (a(i, a) && b(i, b)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean a(int i, List<Integer> l) {
        for (int d : l) {
            if (i % d != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(int i, List<Integer> l) {
        for (int d : l) {
            if (i % d != 0) {
                return false;
            }
        }
        return true;
    }
}
