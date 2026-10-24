package Assignment5;

import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Vehicles: ");
        int size = sc.nextInt();
        sc.nextLine(); // Clear buffer

        ElectricVehicle[] evArray = new ElectricVehicle[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\n--- Entering Details for Vehicle #" + (i + 1) + " ---");

            System.out.print("Enter Vehicle ID: ");
            int vehicleId = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter Manufacturing Year: ");
            int manYear = sc.nextInt();

            System.out.print("Enter Engine Capacity (CC): ");
            int engCap = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Fuel Type (e.g., Electric/Hybrid): ");
            String fuelType = sc.nextLine();

            System.out.print("Enter Battery Capacity (kWh): ");
            double batteryCap = sc.nextDouble();

            System.out.print("Enter Driving Range (km): ");
            double drivingRange = sc.nextDouble();

            System.out.print("Enter Charging Time (hours): ");
            double chargingTime = sc.nextDouble();
            sc.nextLine();

            evArray[i] = new ElectricVehicle(vehicleId, brand, manYear, engCap, 
                                             fuelType, batteryCap, drivingRange, chargingTime);
        }

        System.out.println("\n================ ELECTRIC VEHICLE SPECIFICATIONS ================");
        for (ElectricVehicle ev : evArray) {
            ev.displayCompleteDetails();
        }

        sc.close();
    }
}