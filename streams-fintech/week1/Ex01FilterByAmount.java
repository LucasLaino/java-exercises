package week1;

import data.TransactionFactory;
import model.Transaction;
import model.TransactionType;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

/**
 * Demonstrates the {@code and}, {@code or} and {@code negate} methods of
 * {@link java.util.function.Predicate} applied to transactions.
 */
public class Ex01FilterByAmount {

    /**
     * Runs each filter over the sample transactions and prints the result of each one.
     *
     * @param args not used.
     */
    public static void main(String[] args) {
        List<Transaction> transactions = TransactionFactory.create();

        BigDecimal limit = new BigDecimal("1000");

        Predicate<Transaction> aboveLimit = t -> t.value().compareTo(limit) > 0;
        Predicate<Transaction> isCredit = t -> t.type() == TransactionType.CREDIT;

        List<Transaction> aboveLimitTransactions = transactions.stream()
                .filter(aboveLimit)
                .toList();

        List<Transaction> creditTransactions = transactions.stream()
                .filter(isCredit)
                .toList();

        List<Transaction> creditTransactionsAboveLimit = transactions.stream()
                .filter(aboveLimit.and(isCredit))
                .toList();

        List<Transaction> creditOrTransactionsAboveLimit = transactions.stream()
                .filter(aboveLimit.or(isCredit))
                .toList();

        List<Transaction> transactionsAtOrBelowLimit = transactions.stream()
                .filter(aboveLimit.negate())
                .toList();

        System.out.println("Total transactions: " + transactions.size()); // 20
        printResult("Above limit", aboveLimitTransactions); // 6
        printResult("Only credit",  creditTransactions); // 10
        printResult("Credit and above limit", creditTransactionsAboveLimit); // 3
        printResult("Credit or above limit", creditOrTransactionsAboveLimit); // 13
        printResult("Transactions at or below limit", transactionsAtOrBelowLimit); // 14
    }

    /**
     * Prints a title followed by the size of the given list.
     *
     * @param title the label printed before the result
     * @param result the filtered transactions
     */
    private static void printResult(String title, List<Transaction> result) {
        System.out.println(title + ": " + result.size());
    }
}
