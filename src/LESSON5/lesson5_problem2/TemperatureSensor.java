package LESSON5.lesson5_problem2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureSensor implements Sensor{
        private String location;
        private LocalDateTime LastUpdated;
        private double temperature;

        public TemperatureSensor(String location, double temperature) {
            this.location = location;
            this.LastUpdated = LocalDateTime.now();
            this.temperature = temperature;
        }

        @Override
        public String getSensorType() {
            return "Temperature Sensor";
        }

        @Override
        public double getReading() {
            return temperature;
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
            if(temperature > 30){
                return "Turn on the AC!";
            }
            else if(temperature < 18)
                return "Turn on the Heater!";
            else
                return "Temperature is within normal range.";
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




