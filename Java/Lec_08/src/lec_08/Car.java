package lec_08;

public class Car extends Vehicle{

    private String carType;

    private int gasCapacity;
    private int gasGauge;

    public Car(String vehicleType) {
        super(vehicleType);
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public void setGasCapacity(int gasCapacity) {
        this.gasCapacity = gasCapacity;
    }

    public int getGasGauge() {
        return gasGauge;
    }

    public void setGasGauge(int gasGauge) {
        this.gasGauge = gasGauge;
    }

    public void stop(){

    }

    public void accelerate() {
        
    }

    public void fuelUp(int i) {
        
    }
}
