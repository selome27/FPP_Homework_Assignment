package lesson3_Problem3;

public record HotelBooking(String hotelName , int nights , double pricePerNight) {



    public double totalCost(){

        return nights * pricePerNight;
    }


}
