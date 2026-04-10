package eletronics;

public class Gadget {
    protected String brand;
    protected double batteryLife;

    public Gadget(String brand, double batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public String getStatus(){
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                '}';
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public double getBattery() {
        return batteryLife;
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
