package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class UglyNumberII {

    public int nthUglyNumber(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Lookup table to store ugly numbers
        int[] lookup = new int[n];
        // Base initialization
        lookup[0] = 1;
        // Indices to count multiples of 2, 3 and 5
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        // Next multiples of 2, 3 and 5
        int nextMultipleOfTwo = 2;
        int nextMultipleOfThree = 3;
        int nextMultipleOfFive = 5;
        // Variable to store next element in the array
        int nextUglyNumber = 1;
        // Loop until n
        for (int i = 1; i < n; i++) {
            // Get minimum of the three multiples
            nextUglyNumber = Math.min(nextMultipleOfTwo, Math.min(nextMultipleOfThree, nextMultipleOfFive));
            lookup[i] = nextUglyNumber;
            // Check which index needs to be incremented
            if (nextUglyNumber % 2 == 0) {
                i2++;
                nextMultipleOfTwo = lookup[i2] * 2;
            }
            if (nextUglyNumber % 3 == 0) {
                i3++;
                nextMultipleOfThree = lookup[i3] * 3;
            }
            if (nextUglyNumber % 5 == 0) {
                i5++;
                nextMultipleOfFive = lookup[i5] * 5;
            }
        }
        return nextUglyNumber;
    }
}
