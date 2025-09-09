package LESSON5.lesson5_problem1;

public class Product {
    private String productName;
    double price;
    public Product(String  productName ,double price){
        this.productName = productName;
        this.price = price;

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
