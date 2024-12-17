class PassengerCar extends Vehicle {
    private int seatingCapacity;
    
    public PassengerCar(String brand, String model, double cost, double fuelConsumption, int maxSpeed, int seatingCapacity) {
        super(brand, model, cost, fuelConsumption, maxSpeed);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Seating Capacity: " + seatingCapacity;
    }
}
