package LESSON4.lesson4_problem2;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr){
        return revArrHelper(arr, 0 , arr.length-1);


    }

    private static int[] revArrHelper(int[] arr, int start, int end){
        if(start >= end)
            return arr;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return revArrHelper(arr, start + 1 ,end - 1);
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,13};
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
