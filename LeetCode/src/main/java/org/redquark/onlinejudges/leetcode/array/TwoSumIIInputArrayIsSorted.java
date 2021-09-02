package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        // Special case
        if (numbers == null || numbers.length == 0) {
            return new int[2];
        }
        // Array to store indices
        int[] indices = new int[2];
        // Left and right pointers
        int left = 0;
        int right = numbers.length - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Sum of elements at left and right pointers
            int sum = numbers[left] + numbers[right];
            // Check if the sum of two elements is equal to target
            if (sum == target) {
                indices[0] = left + 1;
                indices[1] = right + 1;
                break;
            }
            // If we are too left
            else if (sum < target) {
                left++;
            }
            // If we are too right
            else {
                right--;
            }
        }
        return indices;
    }
}
