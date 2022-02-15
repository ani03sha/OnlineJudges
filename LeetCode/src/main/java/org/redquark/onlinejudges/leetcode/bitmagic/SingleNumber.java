package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        // We will use XOR property which is a ^ a = 0
        // and a ^ b = 1 where a != b.
        // Since every number except one is repeating twice,
        // their XOR will become 0 and only the single number
        // will remain
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }
}
