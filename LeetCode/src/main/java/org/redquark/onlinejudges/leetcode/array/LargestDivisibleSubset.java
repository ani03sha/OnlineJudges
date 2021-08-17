package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        // List to store the largest divisible subset
        List<Integer> output = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return output;
        }
        // Sort the array
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Array to store the index of next multiple of
        // the current element
        int[] nextIndices = new int[n];
        // Fill the array with default values
        Arrays.fill(nextIndices, -1);
        // Array to store the sizes of the largest divisible
        // subset until the current index
        int[] sizes = new int[n];
        // Fill the array with default value 1 because in any
        // case the element itself will be included
        Arrays.fill(sizes, 1);
        // Global maximum length
        int globalMaximum = 1;
        // Index at which the largest divisible subset is found
        int globalIndex = 0;
        // Loop through the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Local maximum length
            int localMaximum = 0;
            // Local index at which largest divisible subset is found
            int localIndex = i;
            // Now, check the factors of current element to its right
            int j = i + 1;
            while (j < n) {
                // Check for the modulus condition
                if (nums[j] % nums[i] == 0 && sizes[j] > localMaximum) {
                    localMaximum = sizes[j];
                    localIndex = j;
                }
                j++;
            }
            // If the local index has not changed
            if (localIndex != i) {
                sizes[i] += sizes[localIndex];
                nextIndices[i] = localIndex;
                if (localMaximum + 1 > globalMaximum) {
                    globalMaximum = localMaximum + 1;
                    globalIndex = i;
                }
            }
        }
        // Populate the output list
        int i = globalIndex;
        while (i >= 0) {
            output.add(nums[i]);
            i = nextIndices[i];
        }
        return output;
    }
}
