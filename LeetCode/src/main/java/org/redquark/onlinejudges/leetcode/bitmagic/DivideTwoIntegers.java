package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        // Check for overflow
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        // Sign of the quotient
        boolean sign = (dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0);
        // Quotient value
        int quotient = 0;
        // Take the absolute values
        long absoluteDividend = Math.abs((long) dividend);
        long absoluteDivisor = Math.abs((long) divisor);
        // Loop until the  dividend is greater than or
        // equal to the divisor
        while (absoluteDividend >= absoluteDivisor) {
            // This represents the number of bits shifted or
            // how many times we can double the number
            int shift = 0;
            while (absoluteDividend >= (absoluteDivisor << shift)) {
                shift++;
            }
            // Add the number of times we shifted to the quotient
            quotient += (1 << (shift - 1));
            // Update the dividend for the next iteration
            absoluteDividend -= absoluteDivisor << (shift - 1);
        }
        return sign ? quotient : -quotient;
    }
}
