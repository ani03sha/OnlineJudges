package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public List<Integer> findDuplicates(int[] nums) {
        // List to store the duplicates
        List<Integer> duplicates = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return duplicates;
        }
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Get the value at the current index, it will be
            // treated as the index to process
            int index = Math.abs(nums[i]) - 1;
            // If the element to be processed is positive, it means
            // we haven't encountered this index before. This signifies
            // the element in the array representing this index is either
            // single or hasn't occurred yet.
            if (nums[index] > 0) {
                // We will mark this index as traversed by negating the
                // element at the index
                nums[index] *= -1;
            }
            // If the element is negative, it means that the value representing
            // this index has occurred before, so that value is a duplicate
            else {
                // Add the actual value to the duplicates list
                duplicates.add(index + 1);
            }
        }
        return duplicates;
    }
}
