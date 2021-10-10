package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class BitwiseANDOfNumbersRange {

    public int rangeBitwiseAnd(int left, int right) {
        // The trick is to start from the right and move towards left
        while (right > left) {
            right &= right - 1;
        }
        return left & right;
    }
}
