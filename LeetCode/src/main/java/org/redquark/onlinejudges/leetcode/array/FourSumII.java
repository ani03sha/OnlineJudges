package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class FourSumII {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // Map to store the sum of pairs either nums1 and nums2 or nums3 and nums4
        // and their respective counts
        Map<Integer, Integer> pairSumCount = new HashMap<>();
        // Let's choose nums1 and nums2 for pair sum
        for (int n1 : nums1) {
            for (int n2 : nums2) {
                pairSumCount.put(n1 + n2, pairSumCount.getOrDefault(n1 + n2, 0) + 1);
            }
        }
        // Count of valid quadruples
        int count = 0;
        // Now, loop though another array to find the additive inverse
        // of the keys in the pairSumCount
        for (int n3 : nums3) {
            for (int n4 : nums4) {
                count += pairSumCount.getOrDefault(-(n3 + n4), 0);
            }
        }
        return count;
    }
}
