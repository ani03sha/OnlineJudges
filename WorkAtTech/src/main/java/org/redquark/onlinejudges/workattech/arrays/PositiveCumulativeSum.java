package org.redquark.onlinejudges.workattech.arrays;

import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {

    public List<Integer> getPositiveCumulativeSum(int[] nums) {
        // List to store the output positive sums
        List<Integer> output = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return output;
        }
        // Array to store prefix sums
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        // Loop through the array elements
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        // Take only positive values in the list
        for (int i = 0; i < nums.length; i++) {
            if (prefixSum[i] > 0) {
                output.add(prefixSum[i]);
            }
        }
        return output;
    }
}
