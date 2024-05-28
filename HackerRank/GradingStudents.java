import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            int compare = 0;
            if (grades.get(i) < 38) {
                result.add(grades.get(i));
            } else if (grades.get(i) % 5 == 0) {
                result.add(grades.get(i));
            } else {
                for (int j = 0; j < grades.get(i); j += 5) {
                    compare += 5;
                }
                if (compare - grades.get(i) < 3) {
                    result.add(compare);
                } else {
                    result.add(grades.get(i));
                }
            }
        }
        return result;
    }
}
