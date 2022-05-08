package org.redquark.onlinejudges.leetcode.design;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class FlattenNestedListIterator {

    interface NestedInteger {

        boolean isInteger();

        Integer getInteger();

        List<NestedInteger> getList();
    }

    static class NestedIterator implements Iterator<Integer> {
        // Stack to store the integers and list of integers
        private final Deque<NestedInteger> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            this.stack = new ArrayDeque<>();
            // If the nested list is null, we don't have anything to return
            if (nestedList == null) {
                return;
            }
            // Add all the elements of nestedList in the stack
            for (int i = nestedList.size() - 1; i >= 0; i--) {
                this.stack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            // We can return an element only if it hasNext() returns true
            if (hasNext()) {
                return stack.pop().getInteger();
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            // Check if the stack is not empty
            while (!this.stack.isEmpty()) {
                // Get the top of the stack
                NestedInteger top = stack.peek();
                // Check if the top is integer
                if (top.isInteger()) {
                    return true;
                }
                // Remove the top
                this.stack.pop();
                for (int i = top.getList().size() - 1; i >= 0; i--) {
                    this.stack.push(top.getList().get(i));
                }
            }
            return false;
        }
    }
}
