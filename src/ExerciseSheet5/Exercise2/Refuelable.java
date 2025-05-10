package ExerciseSheet5.Exercise2;

public interface Refuelable {
    void refuel(double liters);
    double getFuelLevel();
    default boolean canReach(double distance) {
        if(this instanceof Vehicle v) {
            return v.getRange() >= distance;
        }
       return false;
    }
}
