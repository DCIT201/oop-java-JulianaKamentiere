package org.example;

public class Car extends Vehicle implements Rentable {

    private static final double BASE_RATE = 50.0;

    public Car(String vehicleId, String model, double purchasePrice, boolean isAvailable) {
        super( string vehicleId, string model);
   this.purchasePrice = purchasePrice;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return getIsAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented the car: " + getModel() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car " + getModel() + " has been returned.");
    }

    // Overloaded rent method
    public void rent(Customer customer, int days, String specialRequest) {
        if (isAvailableForRental()) {
            setAvailable(false);
            System.out.println(customer.getName() + " rented the car: " + getModel() + " for " + days + " days with special request: " + specialRequest);
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    public static double getBaseRate() {
        return BASE_RATE;
    }
}