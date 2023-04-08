package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        // Special case
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        // Stack to store numbers
        Stack<String> numbers = new Stack<>();
        // Loop through every token in the array
        for (String token : tokens) {
            // If the token is a number, we will push it into
            // the stack
            if (!token.equals("+")
                    && !token.equals("-")
                    && !token.equals("*")
                    && !token.equals("/")) {
                numbers.push(token);
            }
            // If the number is any operand, we will perform the operation
            else {
                int a = Integer.parseInt(numbers.pop());
                int b = Integer.parseInt(numbers.pop());
                switch (token) {
                    case "+" -> numbers.push(String.valueOf(a + b));
                    case "-" -> numbers.push(String.valueOf(b - a));
                    case "*" -> numbers.push(String.valueOf(a * b));
                    case "/" -> numbers.push(String.valueOf(b / a));
                }
            }
        }
        return Integer.parseInt(numbers.pop());
    }
}
