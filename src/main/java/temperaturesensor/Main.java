package temperaturesensor;

public class Main {

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
