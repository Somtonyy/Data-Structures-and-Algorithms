import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int lowest = 1000000000;
        int highest = -100000000;
        int lowestCounter = -1;
        int highestCounter = -1;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) > highest) {
                highest = scores.get(i);
                highestCounter++;
            }
            if (scores.get(i) < lowest) {
                lowest = scores.get(i);
                lowestCounter++;
            }
        }
        result.add(highestCounter);
        result.add(lowestCounter);
        return result;
    }
}
