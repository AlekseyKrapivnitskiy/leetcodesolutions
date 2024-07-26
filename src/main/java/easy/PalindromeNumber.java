package easy;

import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String xx = Integer.toString(x);

        String resultX = "";

        for(int i = 0; i < xx.length(); ++i) {
            int m = xx.length() - i - 1;

            resultX += String.valueOf(xx.charAt(m));

            System.out.println(resultX);
        }

        return xx.equals(resultX);

    }
}
