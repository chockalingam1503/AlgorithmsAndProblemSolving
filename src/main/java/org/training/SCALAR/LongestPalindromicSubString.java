package org.training.SCALAR;

public class LongestPalindromicSubString {
    public static String longestPalindrome(String A) {

        String longestPalinDrome="";

        int N = A.length();
        for (int i = 0; i < N ; i++) {

            int left=i; int right=i;

            while(left>=0 && right< N){
                if(A.charAt(left)!=A.charAt(right)){
                    break;
                }
                String currentPalindrome = A.substring(left, right+1);
                if(currentPalindrome.length()>longestPalinDrome.length()){
                    longestPalinDrome=currentPalindrome;
                }
                left--;
                right++;
            }
             left=i;  right=i+1;
            while(left>=0 && right< N){
                if(A.charAt(left)!=A.charAt(right)){
                    break;
                }
                String currentPalindrome = A.substring(left, right+1);
                if(currentPalindrome.length()>longestPalinDrome.length()){
                    longestPalinDrome=currentPalindrome;
                }
                left--;
                right++;
            }

        }

        return longestPalinDrome;

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("pannao"));
    }

}
