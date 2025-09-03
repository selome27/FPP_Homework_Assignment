package lesson2_Problem6;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter user type(R/C/I): ");
        String type = sc.nextLine().toUpperCase();
        System.out.println("Enter units consumed: ");
        int consumed = sc.nextInt();
        System.out.println("====Electricity Bill====");
        System.out.println("User Type: " + type);
            double num= 0.0;
            switch (type) {
                case "R": num= consumed *0.12;
                    System.out.println("Bill Amount: $" + num);
                    break;
                case "C": num= consumed *0.20;
                    System.out.println("Bill Amount: $" + num);
                    break;
                case "I": num= consumed * 0.35;
                    System.out.println("Bill Amount: $" + num);
                    break;
                default:
                    System.out.println("Invalid code -> $0.00");

            }

            System.out.println("Do you want to calculate another type? (Y/N)");
            sc.nextLine().toUpperCase();

        }

        while (!sc.nextLine().equals("N"));
        System.out.println("Goodbye! Thanks for using the Electricity Bill Generator.");


        }
}
