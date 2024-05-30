import java.util.List;

public class CountApplesAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        for (int i = 0; i < apples.size(); i++) {
            apples.set(i, apples.get(i) + a);
        }
        for (int i = 0; i < oranges.size(); i++) {
            oranges.set(i, oranges.get(i) + b);
        }

        int appleCounter = 0;
        int orangeCounter = 0;

        for (Integer i : apples) {
            if (i >= s && i <= t) {
                appleCounter++;
            }
        }
        for (Integer i : oranges) {
            if (i >= s && i <= t) {
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
