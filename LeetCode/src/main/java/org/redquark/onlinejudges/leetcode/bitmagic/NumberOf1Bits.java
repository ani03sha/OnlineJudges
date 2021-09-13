package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {
        // Count of set bits
        int count = 0;
        // Loop until the number becomes zero
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
