package LESSON5.lesson5_problem2;

public class SensorTestClass {
    public static void main(String[] args) {
        Sensor[] s = new Sensor[5];
        s[0] = new TemperatureSensor("Living Room", 23.5);
        s[1] = new LightSensor("Garden", 80.0);
        s[2] = new SoundSensor("Bedroom", 65.0);
        s[3] = new TemperatureSensor("Kitchen", 35.2);
        s[4] = new SoundSensor("Basement", 88.1);

        for (Sensor ss : s) {
            System.out.println(ss);
        }
    }
}
