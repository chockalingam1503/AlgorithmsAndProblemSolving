package org.training.SCALAR;

public class ReverseString {
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        int i=0;
        int j = A.length()-1;

        while (i<=j){
            swap(sb,i,j);
            i++;
            j--;
        }
        return sb.toString();
    }

    public static void swap(StringBuilder sb , int start, int end){
        char temp =sb.charAt(start);
        sb.setCharAt(start,sb.charAt(end));
        sb.setCharAt(end,temp);
    }

    public static void main(String[] args) {
        System.out.println(solve("sclaer"));
    }
}
