package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class ChampagneTower {

    public double champagneTower(int poured, int queryRow, int queryGlass) {
        // Lookup table to store the amount of champagne
        // filled in the glasses
        double[] lookup = new double[queryRow + 1];
        // Since the cup at the 0-th row will be first and
        // it will be a candidate of getting all the champagne
        // that we are pouring.
        // Once it is full, then it will leak the excess champagne
        // on to the glasses in the next row
        lookup[0] = poured;
        // Now, we will fill the lookup table
        for (int i = 0; i < queryRow; i++) {
            // This loop will take care of all the glasses in
            // the i-th row
            for (int j = i; j >= 0; j--) {
                // Excess champagne for the j-th glass is determined
                // by any positive value after subtracting 1 unit for
                // the current glass
                double excess = Math.max(0, lookup[j] - 1);
                if (j + 1 <= queryRow) {
                    lookup[j + 1] += excess / 2.0;
                }
                lookup[j] = excess / 2.0;
            }
        }
        return Math.min(lookup[queryGlass], 1.0);
    }
}
