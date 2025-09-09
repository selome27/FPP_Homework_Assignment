package LESSON5.lesson5_problem1;

public class Clothing extends Product {

    private String brand;
    private double discount;


    public Clothing(String brand , String productName , double price ,double discount   ) {
        super(productName ,price);
      this.brand = brand;
      this.discount = discount;
    }
    @Override
    public double getPrice() {
        return super.getPrice() - (super.getPrice() * discount / 100);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", discount=" + discount +
                ", price=" + price +
                '}';
    }
}
