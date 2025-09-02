package lesson2_Problem5;

public class SecondMinVal {



    public static  void main(String[] args){
        String input = "2 21 3 45 0 12 18 6 3 1 0 22";
        String[] parts = input.split(" ");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int num : nums){
            if(num < min){
                secondMin = min;
            min = num;
        } else if (num < secondMin && num != min) {
            secondMin = num;
        }


System.out.println("Min: " + min);
System.out.println("Second Min: " + secondMin);


}
    }
}
