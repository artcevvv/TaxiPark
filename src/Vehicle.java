abstract class Vehicle {
    private String brand;
    private String model;
    private double cost;
    private double fuelConsumption;
    private int maxSpeed;

    public Vehicle(String brand, String model, double cost, double fuelConsumption, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    public double getCost() {
        return cost;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return brand + " " + model + " | Cost:  " + cost + " | Fuel Consumption " + fuelConsumption + "L/100km | Max Speed: " + maxSpeed + "km/h";
    }
}