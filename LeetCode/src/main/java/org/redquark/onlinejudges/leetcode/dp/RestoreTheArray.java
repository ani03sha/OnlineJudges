package org.redquark.onlinejudges.leetcode.dp;

public class RestoreTheArray {

    public int numberOfArrays(String s, int k) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 1;
        }
        // Modulo
        final int MODULUS = 1000000007;
        // Length of the string
        int n = s.length();
        // Lookup table to store the number of ways we can
        // print the prefix string s[0 --> i - 1]
        int[] lookup = new int[n + 1];
        // Empty string has one valid split
        lookup[0] = 1;
        // Traverse through the string
        for (int i = 0; i < n; i++) {
            // Ignore zeroes
            if (s.charAt(i) == '0') {
                continue;
            }
            // Iterate from i to the end of the string
            for (int j = i; j < n; j++) {
                // Get the current number
                String current = s.substring(i, j + 1);
                // Check for its validity
                if (Long.parseLong(current) > k) {
                    break;
                }
                lookup[j + 1] = (lookup[j + 1] + lookup[i]) % MODULUS;
            }
        }
        return lookup[n];
    }
}
