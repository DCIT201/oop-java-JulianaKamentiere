package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Vehicle Rental Management System");
            Vehicle car = new Car("C001", "Lezus", 50.0, true);
            Vehicle motorcycle = new Motorcycle("M001", "Mercedes", 40.0, false);
            Vehicle truck = new Truck("T001", "Benz", 70.0, 1000.0);
        
            System.out.println(car);
            System.out.println("Rental cost for 3 days: $" + car.calculateRentalCost(3));
        
            System.out.println(motorcycle);
            System.out.println("Rental cost for 3 days: $" + motorcycle.calculateRentalCost(3));
        
            System.out.println(truck);
            System.out.println("Rental cost for 3 days: $" + truck.calculateRentalCost(3));
              
                   
            }
}
  
        
    

   
        
    
            
        
        
