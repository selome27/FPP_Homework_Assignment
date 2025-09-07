package LESSON4.lesson4_problem1;

public class MinChar {

    public static char minChar(String s) {

        if (s.length() == 1) {
            return s.charAt(0);

        }

        char min = minChar(s.substring(1));

        if (min < s.charAt(0)) {
            return min;
        } else {
            return s.charAt(0);
        }


    }
    public static void main(String[] args){

        System.out.println(minChar("akel"));

    }
}
