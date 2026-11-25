package week1;

import data.TransactionFactory;
import model.Transaction;
import model.TransactionType;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Demonstrates {@link java.util.function.Function} by converting transactions
 * into statement lines in the format {@code date | category | value}.
 */
public class Ex02StatementLine {

    /**
     * Converts each transaction into a statement line and prints it.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        List<Transaction> transactions = TransactionFactory.create();

        Predicate<Transaction> isDebit = t -> t.type() == TransactionType.DEBIT;

        Function<Transaction, String> date = t -> t.date().format(DateTimeFormatter.ISO_LOCAL_DATE);
        Function<Transaction, String> category = Transaction::category;
        Function<Transaction, String> value = t -> {
            if (isDebit.test(t)) {
                return formatCurrency(t.value().negate());
            }
            return formatCurrency(t.value());
        };
        Function<Transaction, String> statementLine = t -> String.join(" | ", date.apply(t), category.apply(t), value.apply(t));

        List<String> statementLines = transactions.stream()
                .map(statementLine)
                .toList();

        // Expected for 01 (debit): 2026-11-24 | Pharmacy | -R$ 154,00
        // Expected for 02 (credit): 2026-02-23 | Pharmacy | R$ 301,42
        for (String line : statementLines) {
            System.out.println(line);
        }
    }

    /**
     * Formats an amount as Brazilian currency.
     *
     * @param amount the value to format
     * @return the amount as text, in Brazilian currency format
     *
     */
    private static String formatCurrency(BigDecimal amount) {
        Locale brazil = Locale.of("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(brazil);
        return numberFormat.format(amount);
    }
}
