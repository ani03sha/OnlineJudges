package org.redquark.onlinejudges.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class MaximumFrequencyStack {

    static class FreqStack {
        // Mappings of elements and their frequencies
        private final Map<Integer, Integer> frequencies;
        // Mappings of frequencies and stack of elements with same frequencies
        private final Map<Integer, Stack<Integer>> countToStack;
        // Variable to keep track of maximum frequency in the stack
        private int maximumFrequency;

        public FreqStack() {
            this.maximumFrequency = 0;
            this.frequencies = new HashMap<>();
            this.countToStack = new HashMap<>();
        }

        public void push(int val) {
            // Add the current element to the frequencies map
            frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
            // Update the max frequency, if required
            maximumFrequency = Math.max(maximumFrequency, frequencies.get(val));
            // Add this mapping to the countToStack map
            if (!countToStack.containsKey(frequencies.get(val))) {
                countToStack.put(frequencies.get(val), new Stack<>());
            }
            countToStack.get(frequencies.get(val)).push(val);
        }

        public int pop() {
            // Since we need to pop the value which has maximum frequency,
            // we will have to search it in map and pop it from the respective stack
            int valueToBePopped = countToStack.get(maximumFrequency).pop();
            // Update this value in the frequencies map
            frequencies.put(valueToBePopped, frequencies.get(valueToBePopped) - 1);
            // Update maximum frequency, if required
            if (countToStack.get(maximumFrequency).isEmpty()) {
                maximumFrequency--;
            }
            return valueToBePopped;
        }
    }
}
