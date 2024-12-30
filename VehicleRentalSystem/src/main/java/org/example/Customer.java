package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String customerId;
    private final String name;
    private final String email;
    private List<RentalTransaction> rentalHistory;
    private List<Purchase> purchaseHistory;
    private int loyaltyPoints;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email; // Consider adding email validation here
        this.rentalHistory = new ArrayList<>();
        this.purchaseHistory = new ArrayList<>();
        this.loyaltyPoints = 0;
    }

    public void addPurchase(Purchase purchase) {
        if (purchase != null) {
            purchaseHistory.add(purchase);
            // Update loyalty points based on the purchase
            loyaltyPoints += calculatePoints(purchase);
        }
    }

    public List<Purchase> getPurchaseHistory() {
        return purchaseHistory;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        if (transaction != null) {
            rentalHistory.add(transaction);
        }
    }

    public boolean isEligibleForRental() {
        // Implement eligibility logic here
        return true; 
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints; // Getter for loyalty points
    }

    private int calculatePoints(Purchase purchase) {
        if (purchase == null) {
            return 0; // Return 0 points if purchase is null
        }

        int points = 0;
        switch (purchase.getProductType()) {
            case "Electronics":
                points = (int) (purchase.getAmount() * 0.1); 
                break;
            case "Clothing":
                points = (int) (purchase.getAmount() * 0.2); 
                break;
            case "Groceries":
                points = (int) (purchase.getAmount() * 0.05); 
                break;
            default:
                points = (int) (purchase.getAmount() * 0.1); 
                break;
        }
        return points;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}