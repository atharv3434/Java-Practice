package Assignment5;

public class MotorVehicle extends Vehicle {
    protected int engineCap; // Engine capacity in CC
    protected String fuelType;

    public MotorVehicle(int vehicleId, String brand, int manYear, int engineCap, String fuelType) {
        super(vehicleId, brand, manYear);
        this.engineCap = engineCap;
        this.fuelType = fuelType;
    }

    public void displayMotorDetails() {
        displayBasicDetails();
        System.out.println("Engine Capacity: " + engineCap + " CC");
        System.out.println("Fuel Type: " + fuelType);
    }
}