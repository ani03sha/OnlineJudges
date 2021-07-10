package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class DecodeWays {

    public int numDecodings(String s) {
        // Special case
        if (s == null) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Lookup table to number of decoding ways for a certain value
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = s.charAt(0) == '0' ? 0 : 1;
        // Populate the remaining table
        for (int i = 2; i <= n; i++) {
            // For one digit
            int singleDigit = Integer.parseInt(s.substring(i - 1, i));
            // If we have a mapping for this digit
            if (singleDigit >= 1) {
                lookup[i] += lookup[i - 1];
            }
            // For two digits
            int doubleDigits = Integer.parseInt(s.substring(i - 2, i));
            // If these digits are in the appropriate range
            if (doubleDigits >= 10 && doubleDigits <= 26) {
                lookup[i] += lookup[i - 2];
            }
        }
        return lookup[n];
    }
}
