package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        // Variable to keep track of majority element
        int majority = -1;
        // Variable to keep count of majority element
        int count = 0;
        // Loop over the array
        for (int num : nums) {
            // If the count is zero, then the current element
            // will become the majority element
            if (count == 0) {
                majority = num;
                count++;
            }
            // If the current element is the majority element,
            // we will increment the count else decrement it
            else if (majority == num) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
