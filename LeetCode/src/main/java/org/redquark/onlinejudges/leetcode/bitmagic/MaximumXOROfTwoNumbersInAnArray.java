package org.redquark.onlinejudges.leetcode.bitmagic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class MaximumXOROfTwoNumbersInAnArray {

    public int findMaximumXOR(int[] nums) {
        // Value to store the max result
        int max = 0;
        // Mask for bit manipulation
        int mask = 0;
        // Loop through all the bits in an integer
        // from 31 to 0
        for (int i = 31; i >= 0; i--) {
            // Current mask
            mask |= (1 << i);
            // Set to store all the values processed
            // with mask
            Set<Integer> maskedValues = new HashSet<>();
            // Populate the set
            for (int num : nums) {
                maskedValues.add(num & mask);
            }
            // Calculate the masked max value
            int maskedMax = max | (1 << i);
            // Check if the set contains the XOR of this
            // masked value with every value in the set
            for (int maskedValue : maskedValues) {
                if (maskedValues.contains(maskedValue ^ maskedMax)) {
                    max = maskedMax;
                    break;
                }
            }
        }
        return max;
    }
}
