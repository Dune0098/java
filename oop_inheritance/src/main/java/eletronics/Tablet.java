package eletronics;

public class Tablet extends Gadget {
    double screenSize;

    public Tablet(String brand, double batteryLife, double screenSize) {
        super(brand, batteryLife);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Gadget{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                ", screenSize=" + screenSize +
                '}';
    }
}
