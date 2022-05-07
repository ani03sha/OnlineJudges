package org.redquark.onlinejudges.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Anirudh Sharma
 */
public class OneThreeTwoPattern {

    public boolean find132pattern(int[] nums) {
        // Special case
        if (nums == null || nums.length < 3) {
            return false;
        }
        // Stack to store the elements for pattern "32"
        Deque<Integer> threeTwoPattern = new ArrayDeque<>();
        // Variable at the second position, i.e., "3". This will
        // have the maximum value of among all three numbers
        int second = Integer.MIN_VALUE;
        // Loop through the array of from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            // If we have found a number that is less than second,
            // we have found the pattern. Because at this point,
            // we have found "1" of "132" pattern.
            if (nums[i] < second) {
                return true;
            }
            // Pop from the stack until we have top of stack greater
            // than the current number
            while (!threeTwoPattern.isEmpty() && nums[i] > threeTwoPattern.peek()) {
                second = threeTwoPattern.pop();
            }
            // Push the current element into the stack, this will take
            // care of "32" pattern
            threeTwoPattern.push(nums[i]);
        }
        return false;
    }
}
