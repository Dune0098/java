package vehicles;

public class MotorCycle extends Transport{
    private boolean hasSidecar;

    public MotorCycle(String name, int maxPassengers, boolean hasSidecar) {
        super(name, maxPassengers);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    @Override
    public String getCapacityInfo() {
        return  "Transport: " + name + " can carry " + maxPassengers + " passengers, and has side car: " +
                hasSidecar;
    }
}
