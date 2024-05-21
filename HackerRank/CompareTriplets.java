import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceNum = 0;
        int bobNum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                aliceNum++;
            } else if (b.get(i) > a.get(i)) {
                bobNum++;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(aliceNum);
        result.add(bobNum);
        return result;
    }
}
