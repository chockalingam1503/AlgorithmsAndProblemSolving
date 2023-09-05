package org.training.leetcode;

public class LongestCommonPreFix {
    public static String longestCommonPrefix(String[] strs) {

        String firstString = strs[0];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            sb.append(firstString.charAt(i));
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    return sb.substring(0, sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flooight"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }

}
