package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class LastStoneWeightII {

    public int lastStoneWeightII(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Sum of the elements in the array
        int sum = Arrays.stream(stones).sum();
        // Lookup table to denote if we are able to
        // make a sum represented by the index of the
        // lookup table using the elements of the
        // stones array
        boolean[] lookup = new boolean[sum / 2 + 1];
        // We can always make 0 weight by not selecting anything
        lookup[0] = true;
        // Maximum value that we can make by maximizing one half
        // of the array
        int max = 0;
        // Populate the remaining table
        for (int stone : stones) {
            // Preserve the current state of the lookup table
            boolean[] temp = lookup.clone();
            for (int i = stone; i <= sum / 2; i++) {
                if (lookup[i - stone]) {
                    temp[i] = true;
                    max = Math.max(max, i);
                    // If we have reached the value sum / 2
                    if (max == sum / 2) {
                        return sum - 2 * max;
                    }
                }
            }
            // If we have not found the correct sum, then we
            // will update the state of the ookup table
            lookup = temp;
        }
        return sum - 2 * max;
    }
}
