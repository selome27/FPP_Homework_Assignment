package lesson2_Problem5;

public class SecondMinVal {

    public static void main(String[] args) {
        int[] input = {2, 21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int j = 0; j < input.length; j++) {
            if (input[j] < min) {
                secondMin = min;
                min = input[j];
            } else if (input[j] < secondMin && input[j] != min) {
                secondMin = input[j];
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Second Min: " + secondMin);
    }
}
