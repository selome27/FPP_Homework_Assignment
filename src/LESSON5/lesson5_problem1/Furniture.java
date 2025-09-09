package LESSON5.lesson5_problem1;

public class Furniture extends Product{
    private String material;

    private double shippingCost;

    public Furniture(double price,String productName,String material,double shippingCost) {
        super(productName,price);
        this.material = material;
        this.shippingCost = shippingCost;
    }
    @Override
    public double getPrice() {

        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
