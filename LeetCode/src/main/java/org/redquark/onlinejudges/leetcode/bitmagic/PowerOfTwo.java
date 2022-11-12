package org.redquark.onlinejudges.leetcode.bitmagic;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        // Special case
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
