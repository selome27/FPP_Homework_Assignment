package lesson2_Problem4;

public class PracticeLoops {
    public static void main(String[] args) {
        //a
        int x = 10;
        double s = 0.0 ;
        for(int i = 0; i < x; i++){
            double res = (double)1 / (2 * i + 1);
            if(i % 2 == 1){
                s-= res;
            }
            else
                s += res;
        }
        System.out.println(s);
        System.out.println("=============================");

        //b
        int n = 5;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double result = (double)i / (Math.pow(2, i));
            if (i % 2 == 1) { // when it is odd add
                sum += result;
            }
            else {
                sum -= result;
            }

        }
        System.out.println(sum);
    }
}

