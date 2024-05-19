import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}
