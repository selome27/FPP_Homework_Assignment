package LESSON5.lesson5_problem1;

public class TestClass {
    public static double sumProducts(Product[] col) {
        double sum = 0.0;

        if (col != null) {
            for (Product pro : col) {
                if (pro != null) {
                    sum += pro.getPrice();
                }
            }
        }
        return sum;
    }

    public static void  main(String[] args) {
        Product[] p = new Product[5];

        p[0] = new Electronics("Laptop",1500,6,600 );
        p[1] = new Furniture(500,"Table","steel",600);
        p[2] = new Clothing("Gucci", "Leather",3000,10);
        p[3] = new Electronics("Iphone", 12.3, 12 ,400);
        p[4] = new Furniture(2000,"Sofa","wood",300);

        for (Product p1 : p) {

            System.out.println(p1.getClass().getSimpleName());
            System.out.println(p1);
        }
            System.out.println(sumProducts(p));
        }
    }





