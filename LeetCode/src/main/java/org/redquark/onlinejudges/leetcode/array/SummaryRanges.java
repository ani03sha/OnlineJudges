package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        // List to store ranges
        List<String> ranges = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return ranges;
        }
        // Length of the array
        int n = nums.length;
        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Variable to store start of the current range
            int start = nums[i];
            // Loop until we are getting consecutive numbers
            while (i < n - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            // Check if start and end values are different or not
            if (start != nums[i]) {
                ranges.add(start + "->" + nums[i]);
            } else {
                ranges.add(String.valueOf(start));
            }
        }
        return ranges;
    }
}
