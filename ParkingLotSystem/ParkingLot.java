import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    int largeSpotSize;
    int compactSpotSize;
    int bikeSpotSize;

    List<ParkingSpot> largeParkingSpotList;
    List<ParkingSpot> compactParkingSpotList;
    List<ParkingSpot> bikeParkingSpotList;

    public ParkingLot(int largeSpotSize, int compactSpotSize, int bikeSpotSize) {
        this.bikeSpotSize = bikeSpotSize;
        this.compactSpotSize = compactSpotSize;
        this.largeSpotSize = largeSpotSize;

        largeParkingSpotList = new ArrayList<>();
        compactParkingSpotList = new ArrayList<>();
        bikeParkingSpotList = new ArrayList<>();
    }

    public void parkTheVehicle(Vehicle vehicle) {
        System.out.println("We are parking the vehicle " + vehicle.getVehicleType());

        if (VehicleType.TRUCK.equals(vehicle.getVehicleType())) {
            if (largeSpotSize > 0) {
                parkLargeVehical(vehicle);
            } else {
                System.out.println("Large parking spots are full");
            }
        } else if (VehicleType.CAR.equals(vehicle.getVehicleType())) {
            if (compactSpotSize > 0) {
                parkCompactVehical(vehicle);
            } else {
                System.out.println("Compact parking spots are full");
            }
        } else if (VehicleType.BIKE.equals(vehicle.getVehicleType())) {
            if (bikeSpotSize > 0) {
                parkBikeVehical(vehicle);
            } else {
                System.out.println("Bike parking spots are full");
            }
        } else {
            System.out.println("Given vehicle parking is not available...");
        }
    }

    public void parkLargeVehical(Vehicle vehicle) {
        ParkingSpot largeParkingSpot = new ParkingSpot(ParkingSpotType.LARGE);
        largeParkingSpot.setIsFree(false);
        largeParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(largeParkingSpot);

        largeParkingSpotList.add(largeParkingSpot);
        largeSpotSize--;
        System.out.println("Vehicle TRUCK parked successfully");
    }

    public void parkCompactVehical(Vehicle vehicle) {
        ParkingSpot compactParkingSpot = new ParkingSpot(ParkingSpotType.COMPACT);
        compactParkingSpot.setIsFree(false);
        compactParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(compactParkingSpot);

        compactParkingSpotList.add(compactParkingSpot);
        compactSpotSize--;
        System.out.println("Vehicle CAR parked successfully");
    }

    public void parkBikeVehical(Vehicle vehicle) {
        ParkingSpot bikeParkingSpot = new ParkingSpot(ParkingSpotType.BIKE);
        bikeParkingSpot.setIsFree(false);
        bikeParkingSpot.setVehicle(vehicle);
        vehicle.setParkingSpot(bikeParkingSpot);

        bikeParkingSpotList.add(bikeParkingSpot);
        bikeSpotSize--;
        System.out.println("Vehicle BIKE parked successfully");
    }

    public void unparkTheVehicle(Vehicle vehicle) {
        System.out.println("We are unparking the vehicle " + vehicle.getVehicleType());

        ParkingSpot parkingSpot = vehicle.getpParkingSpot();
        parkingSpot.setIsFree(true);

        if (VehicleType.BIKE.equals(vehicle.getVehicleType())) {
            bikeSpotSize++;
        } else if (VehicleType.TRUCK.equals(vehicle.getVehicleType())) {
            largeSpotSize++;
        } else {
            compactSpotSize++;
        }

        System.out.println("Unparking the vehicle successfully...");
    }
}
