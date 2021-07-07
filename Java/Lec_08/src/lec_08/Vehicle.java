package lec_08;

public class Vehicle {

    private String vehicleType;
    
    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void stop() {
        
    }

    public void accelerate() {
        
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleType=" + vehicleType + "]";
    }
}
