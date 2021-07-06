package org.redquark.onlinejudges.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ImplementStackUsingQueues {

    static class MyStack {

        private Queue<Integer> A;
        private Queue<Integer> B;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            this.A = new LinkedList<>();
            this.B = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            A.add(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            // Base case
            if (A.isEmpty()) {
                throw new IndexOutOfBoundsException("Stack is empty");
            }
            // Leave one element in the queue A and put remaining in B
            while (A.size() != 1) {
                B.add(A.poll());
            }
            // Pop the only left element from A
            int data = A.poll();
            // SWap the queues
            Queue<Integer> temp = A;
            A = B;
            B = temp;
            return data;
        }

        /**
         * Get the top element.
         */
        public int top() {
            // Base case
            if (A.isEmpty()) {
                throw new IndexOutOfBoundsException("Stack is empty");
            }
            // Leave one element in the queue A and put remaining in B
            while (A.size() != 1) {
                B.add(A.poll());
            }
            // Get the last element
            int data = A.poll();
            // Add this element to the B
            B.add(data);
            // Swap the queue
            Queue<Integer> temp = A;
            A = B;
            B = temp;
            return data;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return A.isEmpty();
        }
    }
}
