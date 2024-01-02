package org.training.leetcode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        s = s.trim();

        if(s.indexOf(' ')==-1){
            return s.length();
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return s.length() - 1 - i;
            }
            if (i == 1) {
                return s.length();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();
        System.out.println(obj.lengthOfLastWord("a"));

    }

}
