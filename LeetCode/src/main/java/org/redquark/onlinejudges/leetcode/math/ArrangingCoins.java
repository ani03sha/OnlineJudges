package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class ArrangingCoins {

    public int arrangeCoins(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Using Sridharacharya's formula for solving quadratic equations
        return (int) ((-1 + Math.sqrt(1 + 8 * (long) n)) / 2);
    }
}
