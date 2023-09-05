package org.training.leetcode;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        String sign = null;
        if (x < 0) {
            return false;
        }
        int num = x;

        int newNum = 0;
        while (x > 0) {
            newNum = newNum * 10 + (x % 10);
            x = x / 10;
        }

        if (num == newNum) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1000));
    }

}
