package ds;

import java.util.Stack;

public class LeanStack {

    public static void main(String[] args) {
        Stack<String> stk = new Stack<>();


        stk.push("First");
        stk.push("Second");
        stk.push("Third");

        System.out.println(stk);
        System.out.println(stk.pop());
        System.out.println(stk);
        System.out.println( stk.peek());
        System.out.println(stk);
    }

}
