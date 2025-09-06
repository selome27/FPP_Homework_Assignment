package lesson3_Problem2;

import java.util.Scanner;

public class Event {


    public static void main(String[] args){
        String name , date, time;

        Scanner  scan = new Scanner(System.in);
        System.out.println("Enter an event name , date and time: ");
        String eventName = scan.nextLine();
        String eventDate = scan.nextLine();
        String eventTime = scan.nextLine();
        System.out.println(eventDate);

    }
}
