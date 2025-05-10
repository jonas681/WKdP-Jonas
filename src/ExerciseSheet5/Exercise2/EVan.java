package ExerciseSheet5.Exercise2;

public class EVan extends Vehicle implements Electrified{
    private double batteryLevel;

    public EVan(String id, double maxLoad) {
        super(id, maxLoad);
    }

    @Override
    public void charge(double kWh) {

    }

    @Override
    public double getBatteryLevel() {
        return batteryLevel - getRange() * 0.31;
    }

    @Override
    public double getRange() {
        return batteryLevel;
    }
}
