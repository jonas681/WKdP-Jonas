package Homework4.Exercise3;

public class Lamp implements Switchable, Dimmable{ //Eine Klasse kann nur von einer erben,
                                                   // aber mehrere Interfaces implementieren
    private boolean on = false;
    private int brightness = 0;



    @Override
    public void setBrightness(int level) {
        if(on == true){
            if (level < 0) {
                brightness = 0;
            } else if (level > MAX_BRIGHTNESS) {
                brightness = MAX_BRIGHTNESS;
            } else {
                brightness = level;
            }

        }
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;

    }

    @Override
    public boolean isOn() {
        if(on == true){
            return true;
        }else return false;
    }



}
