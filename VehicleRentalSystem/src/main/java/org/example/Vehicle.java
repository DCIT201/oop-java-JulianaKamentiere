package org.example;

public abstract class Vehicle implements Rentable, Purchase{
    
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    public double purchasePrice;
    private boolean isAvailable;

    public  abstract double  calculateRentalCost(int days);
    public  abstract boolean isAvailableForRental();

public  Vehicle() {
}
public Vehicle (String vehicleId,  double baseRentalRate,boolean isAvailableForRental,String model, double purchasePrice) {
    this.vehicleId = vehicleId;
    this.model = model;
    this.baseRentalRate = baseRentalRate;
    this.isAvailable = true;
    this.purchasePrice = purchasePrice; 
}




    

public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
}

public double getPurchasePrice(){
    return purchasePrice;
}

    public String getVehicleId () { return vehicleId; };
    public double getBaseRentalRate () { return baseRentalRate; }
    public String getModel () { return model; }
    public boolean getIsAvailable () { return isAvailable; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public void purchase(Customer customer) {
        // Logic for purchasing the vehicle
        if (isAvailable) {
            System.out.println(customer.getName() + " purchased " + model + " for $" + purchasePrice);
            isAvailable = false; 
        } else {
            System.out.println("Vehicle is not available for purchase.");
        }

}
}




