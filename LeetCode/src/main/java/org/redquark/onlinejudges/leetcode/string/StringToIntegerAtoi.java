package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class StringToIntegerAtoi {

    public int myAtoi(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Variable to store the final output
        double result = 0;
        // Skip all the leading spaces
        int index = 0;
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        // Check for the sign
        boolean isNegative = false;
        if (index < s.length() && s.charAt(index) == '+') {
            index++;
        } else if (index < s.length() && s.charAt(index) == '-') {
            isNegative = true;
            index++;
        }
        // Loop until the end of the string
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + s.charAt(index) - '0';
            index++;
        }
        // Update the sign of the number if required
        result = isNegative ? -result : result;
        // Check for the boundary conditions
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}
