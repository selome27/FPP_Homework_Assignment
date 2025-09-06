package lesson3_Problem3;

public final class CarRental {
    private final String carModel;
    private final int days;
    private final double ratePerDay;
    private final double milesPerDay;

    public CarRental(String carModel, int days, double ratePerDay, double milesPerDay) {
        this.carModel = carModel;
        this.days = days;
        this.ratePerDay = ratePerDay;
        this.milesPerDay = milesPerDay;
    }

    public double totalRentalCost() {
        return days * ratePerDay;
    }

    public double totalMilesAllowed() {
        return days * milesPerDay;
    }


    public String carModel() { return carModel; }
    public int days() { return days; }
    public double ratePerDay() { return ratePerDay; }
    public double milesPerDay() { return milesPerDay; }
}
