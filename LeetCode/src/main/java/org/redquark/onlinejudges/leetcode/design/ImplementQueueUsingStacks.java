package org.redquark.onlinejudges.leetcode.design;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class ImplementQueueUsingStacks {

    static class MyQueue {
        // Stacks to store the elements of the queue
        private final Stack<Integer> stackOne;
        private final Stack<Integer> stackTwo;

        public MyQueue() {
            this.stackOne = new Stack<>();
            this.stackTwo = new Stack<>();
        }

        public void push(int x) {
            // Add the value in the first stack.
            // This makes push operation O(1)
            stackOne.push(x);
        }

        public int pop() {
            // Check if both stacks are empty
            if (stackOne.isEmpty() && stackTwo.isEmpty()) {
                throw new RuntimeException("Underflow");
            }
            // If the second stack is empty, move elements from
            // first stack to it
            move();
            // Return top element of the second stack
            return stackTwo.pop();
        }

        public int peek() {

            // Check if both stacks are empty
            if (stackOne.isEmpty() && stackTwo.isEmpty()) {
                throw new RuntimeException("Underflow");
            }
            // If the second stack is empty, move elements from
            // first stack to it
            move();
            // Return top element of the second stack
            return stackTwo.peek();
        }

        public boolean empty() {
            return stackOne.isEmpty() && stackTwo.isEmpty();
        }

        private void move() {
            if (stackTwo.isEmpty()) {
                while (!stackOne.isEmpty()) {
                    stackTwo.push(stackOne.pop());
                }
            }
        }
    }
}
