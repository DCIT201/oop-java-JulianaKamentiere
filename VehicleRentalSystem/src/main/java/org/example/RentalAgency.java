package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;
    private List<RentalTransaction> rentalTransactions;

    public RentalAgency() {
        this.vehicleFleet = new ArrayList<>();
        this.rentalTransactions = new ArrayList<>();
    }

   
    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    
    public RentalTransaction rentVehicle(Customer customer, String vehicleId, int days) {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental() && customer.isEligibleForRental()) {
                vehicle.setAvailable(false); 
                RentalTransaction transaction = new RentalTransaction(customer, vehicle, LocalDate.now(), days);
                rentalTransactions.add(transaction);
                customer.addRentalTransaction(transaction);
                return transaction;
            }
        }
        return null; 
    }

    // Method to return a vehicle
    public void returnVehicle(RentalTransaction transaction) {
        Vehicle vehicle = transaction.getVehicle();
        vehicle.setAvailable(true); 
        rentalTransactions.remove(transaction); 
    }

    // Method to generate a report of all rentals
    public void generateRentalReport() {
        for (RentalTransaction transaction : rentalTransactions) {
            System.out.println(transaction);
        }
    }


}
