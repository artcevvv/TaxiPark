import java.util.*;


public class TaxiPark {
    private List<Vehicle> fleet;

    public TaxiPark() {
        fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public double calculateTotalFleetCost() {
        return fleet.stream().mapToDouble(Vehicle::getCost).sum();
    }

    public void sortFleetByFuelConsumption() {
        fleet.sort(Comparator.comparingDouble(Vehicle::getFuelConsumption));
    }

    public List<Vehicle> findVehiclesBySpeedRange(int minSpeed, int maxSpeed) {
        List<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : fleet) {
            if (vehicle.getMaxSpeed() >= minSpeed && vehicle.getMaxSpeed() <= maxSpeed) {
                result.add(vehicle);
            }
        }
        return result;
    }

    private void displayFleet() {
        for (Vehicle vehicle : fleet) {
            System.out.println(vehicle);
        }
    }

    public static void main(String[] args) {
        TaxiPark taxiPark = new TaxiPark();

        taxiPark.addVehicle(new PassengerCar("Toyota", "Camry", 25000, 7.5, 210, 5));
        taxiPark.addVehicle(new PassengerCar("Honda", "Civic", 22000, 6.8, 200, 5));
        taxiPark.addVehicle(new PassengerCar("Ford", "Focus", 18000, 8.0, 190, 5));

        System.out.println("Taxi Fleet: ");
        taxiPark.displayFleet();

        System.out.println("\nTotal Fleet Cost: " + taxiPark.calculateTotalFleetCost() + " USD");

        System.out.println("\nFleet Sorted by Fuel Consumption: ");
        taxiPark.sortFleetByFuelConsumption();
        taxiPark.displayFleet();

        int minSpeed = 180; 
        int maxSpeed = 210;

        System.out.println("\nVehicles with speed between " + minSpeed + " and " + maxSpeed + "km/h");
        List<Vehicle> speedRangeVehicles = taxiPark.findVehiclesBySpeedRange(minSpeed, maxSpeed);
        for (Vehicle vehicle : speedRangeVehicles) {
            System.out.println(vehicle);
        }
    }
}
