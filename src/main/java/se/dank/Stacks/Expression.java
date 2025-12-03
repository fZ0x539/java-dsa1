package se.dank.Stacks;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input) {
        if (input == null) throw new IllegalArgumentException();

        // Edge Cases
        // (
        // )
        // (( )
        // ) (
        Stack<Character> parenthesisStack = new Stack<>();
        Stack<Character> bracketStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            switch (ch) {
                case '(':
                    parenthesisStack.push(ch); break;

                case ')': {
                    if(parenthesisStack.empty()) return false;
                    parenthesisStack.pop();
                    break;
                }
                case '[': {
                    bracketStack.push(ch); break;
                }
                case ']': {
                    if(bracketStack.empty()) return false;
                    bracketStack.pop();
                    break;
                }

            }
        }
        return (parenthesisStack.empty() && bracketStack.empty());

    }
}
