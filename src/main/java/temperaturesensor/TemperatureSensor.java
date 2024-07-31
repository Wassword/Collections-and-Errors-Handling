package temperaturesensor;

import SensorsandTemperartures.Sensor;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn;
    private Random random;

    public TemperatureSensor() {
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (!this.isOn) {
            throw new IllegalStateException("Temperature sensor is off");
        }
        // Generate a random number in the range -30 to 30
        return this.random.nextInt(61) - 30;
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        System.out.println(sensor.isOn()); // Output: false
        sensor.setOn();
        System.out.println(sensor.isOn()); // Output: true
        System.out.println(sensor.read()); // Output: Random number between -30 and 30
        sensor.setOff();

        try {
            System.out.println(sensor.read()); // This should throw an IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Output: Temperature sensor is off
        }
    }
}
