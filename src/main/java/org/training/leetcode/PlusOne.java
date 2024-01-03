package org.training.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits.length<1){
            return digits;
        }

        String numChar = "";
        for (int i = 0; i < digits.length; i++) {
            numChar = numChar + (digits[i]);
        }

        if(numChar.length()>18) {
            BigInteger bigNum = new BigInteger(numChar);
            bigNum=bigNum.add(BigInteger.valueOf(1));
            numChar= String.valueOf(bigNum);
        } else {
            Long finalNum = Long.parseLong(numChar) + 1;
            numChar = Long.toString(finalNum);
        }

        if (digits.length != numChar.length()) {

            digits = new int[digits.length + 1];
        }
        for (int i = 0; i < numChar.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(numChar.charAt(i)));
        }


        return digits;
    }

    public static void main(String[] args) {

        PlusOne obj = new PlusOne();
        int[] resArray = obj.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});
        Arrays.stream(resArray).forEach(a-> System.out.println(a));

    }
}
