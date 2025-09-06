package LESSON3.lesson3_Problem4;

import LESSON3.lesson3_Problem4.PizzaSIze;
import LESSON3.lesson3_Problem4.PizzaType;

public class Pizza {
    private final static double TAX_RATE = 0.3;
    private PizzaSIze pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;
    String choice;

    public Pizza(PizzaSIze pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double size = switch (pizzaSize) {
            case SMALL -> 8;
            case MEDIUM -> 10;
            case LARGE -> 12;
        };
        double type = switch (pizzaType) {
            case VEGGIE -> 1;
            case PEPPERONI -> 2;
            case CHEEZE -> 1.5;
            case BBQCHICKEN -> 2;

        };
        this.price = (size + type) * quantity;
    }

    public String printOrderSummary() {
        calculatePrice();
        double taxAmount = price * TAX_RATE;
        double totalPrice = price + taxAmount;
        return String.format(
                "Pizza Order:%n" +
                        "Size: %s%n" +
                        "Type: %s%n" +
                        "Qty: %s%n" +
                        "Price: %s%n" +
                        "Tax: $%.2f%n" +
                        "Total Price: $%.2f", totalPrice, pizzaSize, pizzaType, quantity, price, taxAmount

        );

    }
}