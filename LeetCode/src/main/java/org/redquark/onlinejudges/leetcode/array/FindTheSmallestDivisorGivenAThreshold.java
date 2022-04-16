package org.redquark.onlinejudges.leetcode.array;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class FindTheSmallestDivisorGivenAThreshold {

    public int smallestDivisor(int[] nums, int threshold) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        Arrays.sort(nums);
        // Start and end pointers
        int start = 1;
        int end = nums[nums.length - 1];
        // Answer
        int result = 0;
        // Loop until the two pointers meet
        while (start <= end) {
            // Find the middle element
            int middle = start + (end - start) / 2;
            // Find the sum after dividing every element by
            // the middle we calculated
            long divisionSum = getDivisionSum(nums, middle);
            // If the divisonSum is greater than the threshold,
            // we have to move further right, i.e., to find out
            // a greater value of divisor
            if (divisionSum > threshold) {
                start = middle + 1;
            }
            // If the divisionSum is less than the threshold, then
            // the value of middle could be the potential answer
            // but there can be a case where a bigger value of the
            // divisor is the answer
            else {
                result = middle;
                end = middle - 1;
            }
        }
        return result;
    }

    private long getDivisionSum(int[] nums, int divisor) {
        long divisionSum = 0;
        for (int num : nums) {
            divisionSum += num % divisor == 0 ? (num / divisor) : (num / divisor + 1);
        }
        return divisionSum;
    }
}
