package Lesson3_Problem1;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Liya", "Teklu", "203-13-2345");
        Customer c2 = new Customer("Selome", "T", "203-13-2345");
        Customer c3 = new Customer("Birhan", "Reda", "203-13-2345");

        Address a1 = new Address("falls", "8707", "VA", "345");
        Address a2 = new Address("chicago", "234", "MD", "567");
        Address a3 = new Address("Newyork", "123", "Newyork", "234");

        c1.setBillingAddress(a1);
        c2.setBillingAddress(a2);
        c3.setBillingAddress(a3);

        Customer[] customer = {c1, c2, c3};
        for (Customer cc : customer) {
            if (cc.getBillingAddress().getCity().equalsIgnoreCase("chicago")) {
                System.out.println(cc);
            }
        }
    }
}
