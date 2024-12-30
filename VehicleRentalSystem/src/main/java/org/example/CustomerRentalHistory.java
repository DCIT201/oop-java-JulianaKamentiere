package org.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerRentalHistory implements RentalHistory {
    private Customer customer;
    private List<RentalTransaction> transactions; 

    public CustomerRentalHistory(Customer customer) {
        this.customer = customer;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void addTransaction(RentalTransaction transaction) {
        if (transaction != null) {
            transactions.add(transaction);
            customer.addRentalTransaction(transaction); 
        }
    }

    @Override
    public List<RentalTransaction> getTransactions() {
        return transactions;
    }

    @Override
    public void printRentalHistory() {
        System.out.println("Rental History for " + customer.getName() + ":");
        if (transactions.isEmpty()) {
            System.out.println("No rental transactions found.");
        } else {
            for (RentalTransaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }
}

