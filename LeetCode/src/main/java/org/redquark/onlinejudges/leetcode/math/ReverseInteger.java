package org.redquark.onlinejudges.leetcode.math;

public class ReverseInteger {

    public int reverse(int x) {
        // Sign of the number
        boolean isNegative = x < 0;
        // Get the absolute value
        int absoluteX = Math.abs(x);
        // Reversed value of x
        int reversedX = 0;
        // Loop until x is greater than 0
        while (absoluteX > 0) {
            int remainder = absoluteX % 10;
            // Check for the overflow condition
            if (reversedX > Integer.MAX_VALUE / 10 || (Integer.MAX_VALUE - remainder < reversedX * 10)) {
                return 0;
            }
            reversedX = reversedX * 10 + remainder;
            absoluteX /= 10;
        }
        return isNegative ? -reversedX : reversedX;
    }
}
