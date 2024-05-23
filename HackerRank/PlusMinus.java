import java.text.NumberFormat;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double numPositive = 0;
        double numNegative = 0;
        double zero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                numPositive++;
            } else if (arr.get(i) < 0) {
                numNegative++;
            } else {
                zero++;
            }
        }

        NumberFormat form = NumberFormat.getInstance();
        form.setMaximumFractionDigits(6);
        form.setMinimumFractionDigits(6);
        System.out.println(form.format(numPositive / arr.size()));
        System.out.println(form.format(numNegative / arr.size()));
        System.out.println(form.format(zero / arr.size()));
    }
}
