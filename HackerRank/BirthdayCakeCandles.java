import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int largestNum = 0;
        int sum = 0;
        for (int i = 0; i < candles.size(); i++) {
            int temp = candles.get(i);
            if (temp > largestNum) {
                largestNum = temp;
            }
        }
        for (int i = 0; i < candles.size(); i++) {
            if (largestNum == candles.get(i)) {
                sum++;
            }
        }
        return sum;
    }

}
