import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * HackerRank - Java Currency Formatter
 * https://www.hackerrank.com/challenges/java-currency-formatter/problem
 *
 * Reads a double-precision number representing an amount of money
 * it formatted as US, Indian, Chinese and French currency, using Locale and NumberFormat.
 *
 * Validated on HackerRank with Java 8. Newer JDKs use different locale data,
 * so some currency symbols and spaces may differ form the challenge's sample output.
 */
public class JavaCurrencyFormatterSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double payment = sc.nextDouble();
        sc.close();

        String u = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String i = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN")).format(payment);
        String c = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String f = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + u);
        System.out.println("India: " + i);
        System.out.println("China: " + c);
        System.out.println("France: " + f);

    }
}
