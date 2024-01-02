package org.training.leetcode;

public class IfSubStringExists {
    public static int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){

            for (int i = 0; i <= haystack.length()-needle.length() ; i++) {
                if(haystack.substring(i ,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println( strStr1("mississippi" , "issip"));
    }


    public static int strStr1(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        // using KMP pattern matching algorithm

        int[] lps = new int[needle.length()];
      //  computeLPSArray(needle, lps);

        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            else {
                if (j == 0) i++;
              //  else j = lps[j - 1];
                else j = 0;
            }

            if (j == needle.length()) return i - needle.length();
        }

        return -1;
    }


    private static void computeLPSArray(String needle, int[] lps) {
        int len = 0;
        int i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }

                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static boolean  contains(String FirstString, String secondString){

        if(FirstString.length()<secondString.length()){
            return false;
        }
        int j=0;
        for (int i = 0; i < FirstString.length(); i++) {
            if(FirstString.charAt(i)==secondString.charAt(j)){
                j++;
            }

        }

        return false;
    }
}
