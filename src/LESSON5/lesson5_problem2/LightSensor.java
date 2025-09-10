package LESSON5.lesson5_problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LightSensor implements Sensor  {
    private String location;
    private double lightLevel;
    private LocalDateTime LastUpdated;

    public LightSensor(String location, double lightLevel) {
        this.location = location;
        this.lightLevel = lightLevel;
        this.LastUpdated = LocalDateTime.now();
    }

    @Override
    public String getSensorType() {
        return "Light Sensor";
    }

    @Override
    public double getReading() {
        return lightLevel;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getLastUpdated() {
        LastUpdated = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm a");
        return LastUpdated.format(df);
    }

    @Override
    public String performAction() {
        if(lightLevel < 100){
            return "Light level is too low! Turning on the lights.";
        }
        else
            return "Light is sufficient.";
    }

    @Override
    public String toString() {
        return "Sensor Type: " + getSensorType() + "\n" +
                "Reading: " + getReading() + "\n" +
                "Location: " + getLocation() + "\n" +
                "Last Updated: " + getLastUpdated() + "\n" +
                "Action: " + performAction() + "\n---------------------------------------------";
    }
}
