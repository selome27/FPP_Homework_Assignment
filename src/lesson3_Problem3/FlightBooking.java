package lesson3_Problem3;

public record FlightBooking(String origin , String destination , double distanceKm) {
    public double computeFlightTime(double avgSpeed){
        return distanceKm/avgSpeed;
    }

}
