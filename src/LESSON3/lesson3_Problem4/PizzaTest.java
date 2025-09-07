package LESSON3.lesson3_Problem4;

public class PizzaTest {
        public static void main(String[] args) {
            Pizza pizza1 = new Pizza(PizzaSIze.SMALL,PizzaType.VEGGIE, 2);
            Pizza pizza2 = new Pizza(PizzaSIze.MEDIUM, PizzaType.PEPPERONI, 1);
            Pizza pizza3 = new Pizza(PizzaSIze.LARGE, PizzaType.BBQCHICKEN, 2);
            System.out.println(pizza1.printOrderSummary());
            System.out.println(pizza2.printOrderSummary());
            System.out.println(pizza3.printOrderSummary());
        }
    }


