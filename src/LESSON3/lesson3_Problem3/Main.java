package lesson3_Problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueChoice;

        do {

            System.out.println("Enter F for Flight Booking");
            System.out.println("Enter H for Hotel Booking");
            System.out.println("Enter C for Car Rental");
            String choice = sc.nextLine().toUpperCase();


            String result = switch (choice) {
                case "F" -> {
                    System.out.print("Enter origin: ");
                    String origin = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String destination = sc.nextLine();
                    System.out.print("Enter distance in km: ");
                    double distance = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter average speed (km/h): ");
                    double avgSpeed = Double.parseDouble(sc.nextLine());

                    FlightBooking flight = new FlightBooking(origin, destination, distance);
                    double hours = flight.computeFlightTime(avgSpeed);
                    System.out.printf("Estimated Flight Time: %.2f hours%n", hours);

                    yield "y";
                }
                case "H" -> {
                    System.out.print("Enter hotel name: ");
                    String hotelName = sc.nextLine();
                    System.out.print("Enter number of nights: ");
                    int nights = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter price per night: ");
                    double price = Double.parseDouble(sc.nextLine());

                    HotelBooking booking = new HotelBooking(hotelName, nights, price);
                    System.out.printf("Total Hotel Cost: %.2f%n", booking.totalCost());

                    yield "y";
                }
                case "C" -> {
                    System.out.print("Enter car model: ");
                    String model = sc.nextLine();
                    System.out.print("Enter number of days: ");
                    int days = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter rate per day: ");
                    double rate = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter miles per day: ");
                    double miles = Double.parseDouble(sc.nextLine());

                    CarRental rental = new CarRental(model, days, rate, miles);
                    System.out.printf("Total Rental Cost: %.2f%n", rental.totalRentalCost());
                    System.out.printf("Total Miles Allowed: %.2f%n", rental.totalMilesAllowed());

                    yield "y";
                }
                default -> {
                    System.out.println("Invalid choice!");
                    yield "n";
                }
            };

            System.out.print("Do you want to continue (y/n): ");
            continueChoice = sc.nextLine().toLowerCase();

        } while (continueChoice.equals("y"));

        sc.close();

    }
}
