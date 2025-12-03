package se.dank.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StacksMain {
    public static void main(String[] args) {
        // LIFO - Last in First out
        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        var top = stack.pop();
//        System.out.println(stack );
//        System.out.println("Pop: " + top);
//        System.out.println(stack );
//        System.out.println("is empty? " + stack.empty());
//        System.out.println("Topmost item right now? " + stack.peek());
        DStack dstack = new DStack();
        int pushed = dstack.push(5);
        int pushed2 = dstack.push(10);
        System.out.println(Arrays.toString(dstack.toArray()));
        int popped = dstack.pop();
        int popped2 = dstack.pop();
        System.out.println(dstack);
        dstack.push(50);
        dstack.push(50);
        dstack.push(50);

        System.out.println(Arrays.toString(dstack.toArray()));


//
//
//        String str = "Please Halp";
//        System.out.println(stringReverser(str));
//        String unbalancedExp = "Hel ( lo";
//        String balancedExp = "Hello ( lo)";
//        String error = "(Hello [lo])";
//        Expression expression = new Expression();
//        System.out.println(unbalancedExp + " : " + expression.isBalanced(unbalancedExp));
//        System.out.println(balancedExp + " : " + expression.isBalanced(balancedExp));
//        System.out.println(error + " : " + expression.isBalanced(error));
    }

    public static String stringReverser(String input){
        if(input == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            stack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }
}
