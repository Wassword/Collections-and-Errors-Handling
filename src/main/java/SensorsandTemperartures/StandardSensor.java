package SensorsandTemperartures;

public class StandardSensor implements Sensor{
    private int value;

    //Constructor
    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.value;
    }
}
