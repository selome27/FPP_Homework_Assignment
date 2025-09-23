package LESSON12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;
        try{
        System.out.print("Enter quantity of items to add (1-50): ");

        int quantity = sc.nextInt();
            if (quantity < 1 || quantity > 50) {
                throw new IllegalArgumentException("Quantity must be between 1 and 50.");
            }
            valid =true;
        System.out.println("Successfully added " + quantity + " items to your cart!");

    }catch (InputMismatchException e){
            System.out.println("The input is not working");
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
        sc.close();
    }

}
