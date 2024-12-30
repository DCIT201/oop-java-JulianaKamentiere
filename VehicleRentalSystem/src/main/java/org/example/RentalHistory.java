package org.example;

import java.util.List;

public interface RentalHistory {
    void addTransaction(RentalTransaction transaction);
    List<RentalTransaction> getTransactions();
    void printRentalHistory();
}