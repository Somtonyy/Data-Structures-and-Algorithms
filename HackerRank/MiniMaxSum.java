import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int maxNumber = 0;
        int minNumber = 1000000000;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            sum += arr.get(i);
            if (temp > maxNumber) {
                maxNumber = temp;
            }
            if (temp < minNumber) {
                minNumber = temp;
            }
        }
        System.out.println((sum - maxNumber) + " " + (sum - minNumber));
    }
}
