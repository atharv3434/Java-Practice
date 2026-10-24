package Assignment5;

import java.time.Year;

public class Vehicle {
    protected int vehicleId;
    protected String brand;
    protected int manYear;

    public Vehicle(int vehicleId, String brand, int manYear) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.manYear = manYear;
    }

    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - manYear;
    }

    public void displayBasicDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturing Year: " + manYear);
        System.out.println("Vehicle Age: " + calculateAge() + " years");
    }
}