package LESSON4.lesson4_problem3;

public class Palindrome {
    public static boolean isPalindrome(int num){
        if(num<0)
            return false;
        return num == palindromeHelper(num,0);
    }
    private static int palindromeHelper(int num, int r){
        if(num == 0)
            return r;
        return palindromeHelper(num/10, r * 10 + num%10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(213));
    }
}
