package org.training.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    static Map<String, Integer> mp = new HashMap<>();

    static {
        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);
    }

    public static int romanToInt(String s) {
        int num=0;
        int prevRomanValue =-1;
        for (int i = 0; i <s.length() ; i++) {
            int currentRomanVale = mp.get(Character.toString(s.charAt(i)));
           if(prevRomanValue!=-1 && prevRomanValue<currentRomanVale){
               num=(num-prevRomanValue)+ (currentRomanVale-prevRomanValue);
           } else  {
               num=num+ currentRomanVale;
           }
            prevRomanValue=currentRomanVale;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}
