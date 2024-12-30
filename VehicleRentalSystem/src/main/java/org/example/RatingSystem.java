package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RatingSystem {
    private HashMap<String, List<Integer>> vehicleRatings;
    private HashMap<String, List<Integer>> customerRatings;

    public RatingSystem() {
        vehicleRatings = new HashMap<>();
        customerRatings = new HashMap<>();
    }

    public void rateVehicle(String vehicleId, int rating) {
        vehicleRatings.putIfAbsent(vehicleId, new ArrayList<>());
        vehicleRatings.get(vehicleId).add(rating);
    }

    public void rateCustomer(String customerId, int rating) {
        customerRatings.putIfAbsent(customerId, new ArrayList<>());
        customerRatings.get(customerId).add(rating);
    }

    public double getAverageVehicleRating(String vehicleId) {
        List<Integer> ratings = vehicleRatings.get(vehicleId);
        return ratings == null || ratings.isEmpty() ? 0 : ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public double getAverageCustomerRating(String customerId) {
        List<Integer> ratings = customerRatings.get(customerId);
        return ratings == null || ratings.isEmpty() ? 0 : ratings.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}