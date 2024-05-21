import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0;
        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}
