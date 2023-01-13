package org.redquark.onlinejudges.workattech.arrays;

import java.util.HashMap;
import java.util.Map;

public class IdenticalTwins {

    public int getIdenticalTwinsCount(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to store frequencies of the elements
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }
        int twins = 0;
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            twins += (entry.getValue()) * (entry.getValue() - 1) / 2;
        }
        return twins;
    }
}
