package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class ValidateStackSequences {

    public boolean validateStackSequencesSolutionOne(int[] pushed, int[] popped) {
        // Total number of elements
        int n = pushed.length;
        // Stack to store the values
        Stack<Integer> stack = new Stack<>();
        // Count of number of elements successfully popped
        int count = 0;
        // Loop through the pushed array
        for (int p : pushed) {
            stack.push(p);
            // Check if this element can be popped in accordance
            // with the popped array
            while (!stack.isEmpty() && count < n && stack.peek() == popped[count]) {
                stack.pop();
                count++;
            }
        }
        // Arrays pushed and popped will represent stack correctly
        // if all the elements are popped successfully
        return count == n;
    }

    public boolean validateStackSequencesSolutionTwo(int[] pushed, int[] popped) {
        // In this solution, instead of using extra space as stack,
        // we will simulate the behavior by using pushed as stack
        // (this solution changes the input)
        // Total number of elements
        int n = pushed.length;
        // Pointers to traverse through pushed and popped arrays respectively
        int i = 0;
        int j = 0;
        // Index to keep track of top of stack
        int top = 0;
        // Loop through the pushed array
        while (i < n) {
            // Check if top of stack is equal to the current element
            // in the popped array
            if (top >= 0 && pushed[top] == popped[j]) {
                j++;
                top--;
            } else {
                i++;
                top++;
                if (i < n) {
                    // Update top
                    pushed[top] = pushed[i];
                }
            }
        }
        return top == 0;
    }
}
