package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        // List to store the missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return missingNumbers;
        }
        int n = nums.length;
        // Loop from 1 to n
        for (int i = 0; i < n; i++) {
            // Index under consideration
            int index = Math.abs(nums[i]) - 1;
            // Make the element at this index negative
            if (nums[index] > 0) {
                nums[index] *= -1;
            }
        }
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // If the element becomes positive then we will
            // add its position to the output list
            if (nums[i] > 0) {
                missingNumbers.add(i + 1);
            }
        }
        return missingNumbers;
    }
}
