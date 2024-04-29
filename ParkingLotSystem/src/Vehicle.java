public class Vehicle {
    private int vehicleNo;
    private VehicleType vehicleType;
    private ParkingSpot parkingSpot;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleNo() {
        return this.vehicleNo;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public ParkingSpot getpParkingSpot() {
        return this.parkingSpot;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public void setVehicleType(VehicleType vehicalType) {
        this.vehicleType = vehicalType;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

}
