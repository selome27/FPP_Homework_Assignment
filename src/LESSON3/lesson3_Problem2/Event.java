package LESSON3.lesson3_Problem2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Event {
    public static void main(String[] args){
        //a
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an event name, date and time: ");
        System.out.print("Event name: ");
        String eventName = scan.nextLine();
        System.out.print("Event date (yyyy-MM-dd): ");
        String eventDate = scan.nextLine();
        System.out.print("Event time (HH:mm): ");
        String eventTime = scan.nextLine();
        LocalDate date = LocalDate.parse(eventDate);
        LocalTime time = LocalTime.parse(eventTime);
        //b
        LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.from(time));
        System.out.println("\nDay of week: " + dateTime.getDayOfWeek());
        System.out.println("Leap year: " + (date.isLeapYear()? "true":"false"));
        //c
        LocalDate today = LocalDate.now();
        LocalDate dateT = dateTime.toLocalDate();
        long daysUntil = dateT.toEpochDay() - today.toEpochDay();
        System.out.print("Days until event: " + daysUntil);
        System.out.println("\n");
        //2
        ZoneId systemZone = ZoneId.systemDefault();
        ZonedDateTime zoneEvent = dateTime.atZone(systemZone);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy @ HH:mm [VV] ");
        System.out.println(zoneEvent.format(format));
        //3
        System.out.println("Enter another time zone( e.g, America/Santiago)");
        String timeZone = scan.nextLine();
        ZoneId zone = ZoneId.of(timeZone);
        ZonedDateTime converted = zoneEvent.withZoneSameInstant(zone);
        System.out.println("->" + converted.format(format));





    }
}
