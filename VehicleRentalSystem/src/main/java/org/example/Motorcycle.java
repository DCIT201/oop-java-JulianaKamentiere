package org.example;

public class Motorcycle extends Vehicle implements Rentable {
    private static final double BASE_RATE = 30.0;

    public Motorcycle(String vehicleId, String model) {
        super(vehicleId, baseRentalRate, isAvailable, model, BASE_RATE);
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
            System.out.println(customer.getName() + " rented the motorcycle: " + getModel() + " for " + days + " days.");
        } else {
            System.out.println("Motorcycle is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Motorcycle " + getModel() + " has been returned.");
    }
}