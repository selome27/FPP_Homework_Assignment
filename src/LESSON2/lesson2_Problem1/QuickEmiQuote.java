package lesson2_Problem1;

import java.util.Random;

public class QuickEmiQuote {
    public static void main(String[] args) {
        //#1
        Random r = new Random();
        int p = r.nextInt(5000,25000);
        int n = r.nextInt(6,36);
        double APR = r.nextDouble(3.5,11.5);

        //#2
        double rate = APR/ 12 / 100 ;
        double EMI = (p * rate * Math.pow(1 + rate , n))/ (Math.pow(1 + rate , n) - 1);
        double totalPayment = EMI * n;
        double totalInterest = totalPayment - p;

        //#3
        int cast = (int)  EMI;
        long round = Math.round(EMI);

        //#4
        System.out.println("========================================================");
        System.out.println("Quick Emi Quote Calculator");
        System.out.println("========================================================");
        System.out.printf("Principal = $%,d%n", p);
        System.out.printf("Tenure = %d months%n", n);
        System.out.printf("APR = %.1f%%\n", APR);
        System.out.println("________________________________________________________");
        System.out.printf("EMI = $%.2f%n ", EMI);
        System.out.printf("Total Payment = $%.2f%n" , totalPayment );
        System.out.printf("Total Interest = $%.2f%n" , totalInterest );
        System.out.println("________________________________________________________");
        System.out.printf("Cast = $%d%n" , cast);
        System.out.printf("Round = $%d%n" , round);
        System.out.println("========================================================");














    }
}
