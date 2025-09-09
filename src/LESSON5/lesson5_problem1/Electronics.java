package LESSON5.lesson5_problem1;

public class Electronics extends Product{
 private int warranty_inMonths;
 private double warranty_Cost;

    public Electronics(String productName, double price , int warranty_inMonths,double warranty_Cost) {
        super(productName, price);
        this.warranty_inMonths = warranty_inMonths;
        this.warranty_Cost = warranty_Cost;
    }
    @Override
    public double getPrice() {
        return super.getPrice() + warranty_Cost;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warranty_inMonths=" + warranty_inMonths +
                ", warranty_Cost=" + warranty_Cost +
                ", price=" + price +
                '}';
    }
}

