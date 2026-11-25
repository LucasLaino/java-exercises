package data;

import model.Transaction;
import model.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Provides sample transactions shared by all exercises.
 */
public class TransactionFactory {

    /**
     * Returns a fixed list of sample transactions.
     *
     * @return the sample transactions
     */
    public static List<Transaction> create() {
        return List.of(
            new Transaction("01", "C6 account", "Pharmacy", new BigDecimal("154.00"),
                    LocalDate.of(2026, 11, 24), TransactionType.DEBIT),

            new Transaction("02", "NuBank account", "Groceries", new BigDecimal("1234.31"),
                LocalDate.of(2026, 8, 12), TransactionType.DEBIT),

            new Transaction("03", "XP account", "Clothes", new BigDecimal("301.42"),
                        LocalDate.of(2026, 2, 23), TransactionType.CREDIT),

            new Transaction("04", "XP account", "Studies", new BigDecimal("999.99"),
                        LocalDate.of(2026, 1, 30), TransactionType.CREDIT),

            new Transaction("05", "C6 account", "Furniture", new BigDecimal("1000.00"),
                LocalDate.of(2026, 11, 19), TransactionType.CREDIT),

            new Transaction("06", "NuBank account", "Groceries", new BigDecimal("87.24"),
                        LocalDate.of(2026, 4, 23), TransactionType.DEBIT),

            new Transaction("07", "C6 account", "Clothes", new BigDecimal("102.21"),
                        LocalDate.of(2026, 6, 23), TransactionType.CREDIT),

            new Transaction("08", "NuBank account", "Studies", new BigDecimal("1000.01"),
                        LocalDate.of(2026, 5, 13), TransactionType.DEBIT),

            new Transaction("09", "C6 account", "Books", new BigDecimal("100.21"),
                        LocalDate.of(2026, 10, 11), TransactionType.DEBIT),

            new Transaction("10", "NuBank account", "Gift", new BigDecimal("96.54"),
                        LocalDate.of(2026, 7, 21), TransactionType.DEBIT),

            new Transaction("11", "XP account", "Clothes", new BigDecimal("301.42"),
                        LocalDate.of(2026, 8, 29), TransactionType.CREDIT),

            new Transaction("12", "XP account", "Car maintenance", new BigDecimal("5000.99"),
                        LocalDate.of(2026, 2, 28), TransactionType.CREDIT),

            new Transaction("13", "C6 account", "Computer", new BigDecimal("2015.10"),
                        LocalDate.of(2026, 5, 10), TransactionType.CREDIT),

            new Transaction("14", "NuBank account", "Groceries", new BigDecimal("242.67"),
                        LocalDate.of(2026, 1, 24), TransactionType.DEBIT),

            new Transaction("15", "C6 account", "Clothes", new BigDecimal("301.42"),
                        LocalDate.of(2026, 3, 24), TransactionType.CREDIT),

            new Transaction("16", "NuBank account", "Food", new BigDecimal("96.01"),
                        LocalDate.of(2026, 4, 1), TransactionType.DEBIT),

            new Transaction("17", "C6 account", "House", new BigDecimal("15000.00"),
                        LocalDate.of(2026, 4, 5), TransactionType.CREDIT),

            new Transaction("18", "NuBank account", "Trip", new BigDecimal("3458.98"),
                        LocalDate.of(2026, 7, 7), TransactionType.DEBIT),

            new Transaction("19", "C6 account", "Food", new BigDecimal("320.24"),
                        LocalDate.of(2026, 5, 9), TransactionType.DEBIT),

            new Transaction("20", "NuBank account", "Video game", new BigDecimal("600.00"),
                        LocalDate.of(2026, 6, 12), TransactionType.CREDIT)
        );
    }
}
