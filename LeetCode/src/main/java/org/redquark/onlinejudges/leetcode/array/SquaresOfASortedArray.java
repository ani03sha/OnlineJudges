package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array to store the output
        int[] squares = new int[n];
        // Index to keep track of squares
        int index = n - 1;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop through the array until the pointers meet
        while (left <= right) {
            // Calculate the squares
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            // Compare the squares
            if (leftSquare > rightSquare) {
                squares[index] = leftSquare;
                left++;
            } else {
                squares[index] = rightSquare;
                right--;
            }
            index--;
        }
        return squares;
    }
}
