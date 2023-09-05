package org.training.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    /*public static boolean isValid(String s) {

        for (int i = 0; i < s.length(); i+=2) {

            if(s.length()>1) {
                switch (s.charAt(i)) {
                    case '{':
                        if (s.charAt(i+1)=='}') {
                            break;
                        }else
                        {
                            return false;
                        }
                    case '[':
                        if (s.charAt(i+1)==']'){
                            break;
                        }else
                        {
                            return false;
                        }
                    case '(':
                        if (s.charAt(i+1)==')'){
                        break;
                    }else
                    {
                        return false;
                    }
                }

            }else {
                return false;
            }
           if(i+1 == s.length()-1){
               return true;
           } else{
               continue;
           }
        }
        return false;
    }*/

    public static boolean isValid(String s) {
        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
        System.out.println(isValid("{}[]()"));
        System.out.println(isValid("{{}[]()"));
        System.out.println(isValid("{)"));
        System.out.println(isValid( "{[]}")); //solve this case , logic need to be changed
        System.out.println(isValid("{{}[]()}"));
    }
}
