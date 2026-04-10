package vehicles;

public class App {
    public static void main(String[] args) {
        Transport[] t = {new Transport("Bus", 10), new Bus("Long", 20, true),
        new MotorCycle("Motor", 2, true)};
        for(Transport i : t){
            System.out.println(i.getCapacityInfo());
        }
    }
}
