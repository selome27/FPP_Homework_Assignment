package LESSON5.lesson5_problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SoundSensor implements Sensor {
    private String location;
    private LocalDateTime LastUpdated;
    private double soundLevel;

    public SoundSensor(String location, double soundLevel) {
        this.location = location;
        this.LastUpdated = LocalDateTime.now();
        this.soundLevel = soundLevel;
    }

    @Override
    public String getSensorType() {
        return "Sound Sensor";
    }

    @Override
    public double getReading() {
        return soundLevel;
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
        if (soundLevel > 70) {
            return "Turn on noise cancellation!";
        } else
            return "Sound is within normal range.";
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


