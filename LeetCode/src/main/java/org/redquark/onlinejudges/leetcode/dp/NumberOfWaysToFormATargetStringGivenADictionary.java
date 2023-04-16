package org.redquark.onlinejudges.leetcode.dp;

public class NumberOfWaysToFormATargetStringGivenADictionary {

    public int numWays(String[] words, String target) {
        // Special case
        if (words == null || words.length == 0 || target == null || target.isEmpty()) {
            return 0;
        }

        final int MODULUS = 1000000007;
        // Length of every string in the dictionary
        int n = words[0].length();
        // Length of target
        int o = target.length();
        // Array to store the frequencies of a character in a word
        int[][] frequencies = new int[26][n];
        // Populate the frequencies array
        for (int i = 0; i < n; i++) {
            for (String word : words) {
                frequencies[word.charAt(i) - 'a'][i]++;
            }
        }
        // Lookup table to store the number of ways to build first i characters
        // of the target using only the j leftmost columns
        long[][] lookup = new long[o + 1][n + 1];
        // If have not started building the string yet
        lookup[0][0] = 1;
        // Populate the lookup table
        for (int i = 0; i <= o; i++) {
            for (int j = 0; j < n; j++) {
                if (i < o) {
                    lookup[i + 1][j + 1] += frequencies[target.charAt(i) - 'a'][j] * lookup[i][j];
                    lookup[i + 1][j + 1] %= MODULUS;
                }
                lookup[i][j + 1] += lookup[i][j];
                lookup[i][j + 1] %= MODULUS;
            }
        }
        return (int) lookup[o][n];
    }
}
