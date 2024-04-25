package org.training.leetcode;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class BinaryAddition {

    public String addBinary(String a, String b) {


        if (a.length() > b.length()) {
            b = addLeadingZeros(b, a.length() - b.length());
        } else {
            a = addLeadingZeros(a, b.length() - a.length());
        }
        String carry = "0";
        String finalVal = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            String total = carry + a.charAt(i) + b.charAt(i);
            String binarySum = findBinarySum(total);
            if (i == 0) {
                finalVal = binarySum + finalVal;
            } else {
                carry = String.valueOf(binarySum.charAt(0));
                finalVal = binarySum.charAt(1) + finalVal;
            }
        }
        /*if(finalVal.length()>18) {
            BigInteger bigNum = new BigInteger(finalVal);
            bigNum=bigNum.add(BigInteger.valueOf(1));
            return String.valueOf(bigNum);
        } else {
            Long finalNum = Long.parseLong(numChar) + 1;
            numChar = Long.toString(finalNum);
        }

        Long finalNum = Long.parseLong(finalVal);*/
        return finalVal;
    }

    public String findBinarySum(String charSet) {
/*
        switch (charSet){
            case "111" :
                return "11";
            case "100" :
            case "001" :
            case "010" :
                return "01";
            case "101" :
            case "011" :
                return "10";

                return "01";
        }*/

     /*   Map<String, Integer> mp = new HashMap<>();
        mp.put("1",0);
        mp.put("0",0);
        for (int i = 0; i < charSet.length(); i++) {
            char key = charSet.charAt(i);
            Integer val = mp.get(key);
            mp.put(String.valueOf(key), ++val);
        }*/

        int countOf1 = 0;
        for (int i = 0; i < charSet.length(); i++) {
            String val = String.valueOf(charSet.charAt(i));
            if (val.equals("1")) {
                countOf1++;
            }
        }

        if (countOf1 == 3) {
            return "11";
        }
        if (countOf1 == 2) {
            return "10";
        }
        if (countOf1 == 1) {
            return "01";
        }
        if (countOf1 == 0) {
            return "00";
        }
        return "00";
    }

    public String addLeadingZeros(String num, int requiredLength) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < requiredLength; i++) {
            sb.append("0");
        }

        sb.append(num);
        return sb.toString();
    }

    public static void main(String[] args) {
        BinaryAddition b = new BinaryAddition();
        System.out.println(b.addBinary("1110110101", "1110111011"));
    }
}
