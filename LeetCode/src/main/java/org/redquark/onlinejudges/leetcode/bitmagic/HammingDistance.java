package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        // XOR of two numbers will give us set bits at position
        // where bits are different in x and y
        int z = x ^ y;
        // Count to find the set bits
        int count = 0;
        // Loop until z becomes zero
        while (z != 0) {
            z &= (z - 1);
            count++;
        }
        return count;
    }
}
