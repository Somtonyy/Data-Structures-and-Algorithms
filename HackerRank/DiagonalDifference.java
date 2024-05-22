import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                if (i == j) {
                    sum1 += arr.get(i).get(j);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            boolean added = false;
            for (int j = arr.get(i).size() - 1 - i; j >= 0 ; j--) {
                if (!added) {
                    sum2 += arr.get(i).get(j);
                    added = true;
                }
            }
        }
        return Math.abs(sum1 - sum2);
    }


}