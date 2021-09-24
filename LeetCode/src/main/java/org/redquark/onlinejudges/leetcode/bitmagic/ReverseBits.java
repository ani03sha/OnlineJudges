package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class ReverseBits {

    public int reverseBits(int n) {
        // Special case
        if (n == 0) {
            return 0;
        }
        // Reverse bit
        int m = 0;
        // Loop for all the positions in a 32-bit integer
        for (int i = 31; i >= 0; i--) {
            // If the current bit in n is 1, set the corresponding
            // bit in m.
            if ((n & 1) != 0) {
                m |= (1 << i);
            }
            n >>= 1;
        }
        return m;
    }
}
