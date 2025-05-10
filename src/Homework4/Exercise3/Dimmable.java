package Homework4.Exercise3;

public interface Dimmable {
  public static final int MAX_BRIGHTNESS = 100; //automatisch public static final = Konstante

    void setBrightness(int level);

    int getBrightness();

    default void dimToHalf(){

        setBrightness(MAX_BRIGHTNESS/2);
    }
}
