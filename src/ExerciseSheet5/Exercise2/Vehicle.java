package ExerciseSheet5.Exercise2;

public abstract class Vehicle {
    private String id;
    private double maxLoad;
    public Vehicle(String id, double maxLoad) {
        this.id = id;
        this.maxLoad = maxLoad;
    }
    public abstract double getRange();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}
