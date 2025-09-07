package LESSON4.lesson4_problem4;

public class ReturnMax {
    public static int max(int[] arr) {
        return maxHelper(arr, 0, Integer.MIN_VALUE);
    }

    private static int maxHelper(int[] arr1, int indexx, int max) {

        if (indexx == arr1.length-1) {
            return max;
        }

        if (arr1[indexx] > max) {
            max = arr1[indexx];
        }
       return  maxHelper(arr1,indexx +1 ,  max);
    }


        public static void main(String[] args){
            System.out.println( max (new int[]{5,-3,6,1,9,4}));

        }
    }

