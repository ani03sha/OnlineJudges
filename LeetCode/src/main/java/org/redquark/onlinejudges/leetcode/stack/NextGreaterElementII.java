package org.redquark.onlinejudges.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the output
        int[] nextGreater = new int[n];
        // Populate the array with default values
        Arrays.fill(nextGreater, -1);
        // Monotone stack
        Stack<Integer> monotone = new Stack<>();
        // Loop through the array
        for (int i = 0; i < 2 * n; i++) {
            while (!monotone.isEmpty() && nums[monotone.peek()] < nums[i % n]) {
                nextGreater[monotone.pop() % n] = nums[i % n];
            }
            monotone.push(i % n);
        }
        return nextGreater;
    }
}
