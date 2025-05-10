package ExerciseSheet5.Exercise2;

public class Truck extends Vehicle implements Refuelable {
    private double fuelLevel = 0;
    private int tankCapacity;
    public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        this.tankCapacity = (int) tankCapacity;
        this.fuelLevel = getMaxLoad();

    }

    @Override
    public void refuel(double liters) {

    }

    @Override
    public double getFuelLevel() {
        return 0;
    }

    @Override
    public double getRange() {
        return 0;
    }
}
