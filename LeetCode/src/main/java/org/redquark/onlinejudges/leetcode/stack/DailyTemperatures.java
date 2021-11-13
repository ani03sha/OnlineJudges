package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        // Special case
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        // Length of the array
        int n = temperatures.length;
        // Array to store the output
        int[] nextWarmers = new int[n];
        // Monotone stack
        Stack<Integer> monotone = new Stack<>();
        // Loop through the temperature array
        for (int i = 0; i < n; i++) {
            while (!monotone.isEmpty() && temperatures[monotone.peek()] < temperatures[i]) {
                // Index of element against which we need to find the
                // next warmer temperature
                int index = monotone.pop();
                // Populate the value for that element
                nextWarmers[index] = i - index;
            }
            monotone.push(i);
        }
        return nextWarmers;
    }
}
