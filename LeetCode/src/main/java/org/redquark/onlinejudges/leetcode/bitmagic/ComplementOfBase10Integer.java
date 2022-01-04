package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int n) {
        // Special case
        if (n == 0) {
            return 1;
        }
        // Number of bits in the number
        int bits = (int) (Math.log(n) / Math.log(2) + 1);
        // Complement will be 2 ^ bits - 1 - n
        return (1 << bits) - 1 - n;
    }
}
