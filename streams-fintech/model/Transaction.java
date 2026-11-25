package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public record Transaction(String id, String account, String category, BigDecimal value, LocalDate data, TransactionType type) {
}
