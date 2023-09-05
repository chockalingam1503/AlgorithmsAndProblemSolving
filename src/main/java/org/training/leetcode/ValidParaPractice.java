package org.training.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParaPractice {

    static Map<Character, Character> mp = new HashMap<>();

    static {
        mp.put('}', '{');
        mp.put(']', '[');
        mp.put(')', '(');
    }

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                if (stk.isEmpty() || stk.pop() != mp.get(s.charAt(i))) {
                    return false;
                }
            } else {
                stk.push(s.charAt(i));
            }
        }

        return stk.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("{{{}}{}{{{{}}}}"));
        System.out.println(isValid("{}[]()"));
        System.out.println(isValid("{{}[]()"));
        System.out.println(isValid("{)"));
        System.out.println(isValid("{[]}")); //solve this case , logic need to be changed
        System.out.println(isValid("{{}[]()}"));
    }
     /*switch (s.charAt(i)){
             case ('}'):
             break;
             case (']'):
             break;
             case (')'):
             break;*/

}
