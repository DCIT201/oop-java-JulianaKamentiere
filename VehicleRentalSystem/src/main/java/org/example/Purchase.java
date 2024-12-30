package org.example;

//The purchase method checks if the vehicle is available and processes the purchase accordingly.
public interface Purchase {

    public static String getProductType() {
        return productType;
    }
    void purchase(Customer customer);
    double getPurchasePrice();

   
    public  String productType ;
    @Override
    String toString();

    public double=amount;

    
}
