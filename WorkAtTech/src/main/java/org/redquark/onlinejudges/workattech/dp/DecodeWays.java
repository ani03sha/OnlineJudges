package org.redquark.onlinejudges.workattech.dp;

public class DecodeWays {

    public int numDecodings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        final int MODULUS = 1000000007;
        // Length of the string
        int n = s.length();
        // Lookup table to store the number of
        // ways to decode a string
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = 1;
        lookup[1] = s.charAt(0) == '0' ? 0 : 1;
        // Populate for remaining positions
        for (int i = 2; i <= n; i++) {
            // Single digit
            int singleDigit = Integer.parseInt(s.substring(i - 1, i));
            if (singleDigit >= 1) {
                lookup[i] += lookup[i - 1] % MODULUS;
            }
            // Double digits
            int doubleDigits = Integer.parseInt(s.substring(i - 2, i));
            if (doubleDigits >= 10 && doubleDigits <= 26) {
                lookup[i] += lookup[i - 2] % MODULUS;
            }
        }
        return lookup[n] % MODULUS;
    }
}
