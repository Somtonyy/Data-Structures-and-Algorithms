import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Locale INDIA = new Locale("en", "IN");
        NumberFormat US = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat INDIA_CURRENCY = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat CHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat FRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + US.format(num));
        System.out.println("India: " + INDIA_CURRENCY.format(num).replace("\u20B9", "").trim());
        System.out.println("China: " + CHINA.format(num).replace("\u00A5", "\uFFE5"));
        System.out.println("France: " + FRANCE.format(num).replace("\u00A4", "\u20AC"));
    }
}