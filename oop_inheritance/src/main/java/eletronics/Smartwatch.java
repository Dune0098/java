package eletronics;

public class Smartwatch extends Gadget {
    private boolean supportHeartRate;

    public Smartwatch(String brand, double batteryLife, boolean supportHeartRate) {
        super(brand, batteryLife);
        this.supportHeartRate = supportHeartRate;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife
                + ", heartRate=" + supportHeartRate +
                '}';
    }
}
