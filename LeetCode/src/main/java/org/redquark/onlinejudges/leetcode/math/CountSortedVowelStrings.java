package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class CountSortedVowelStrings {

    public int countVowelStrings(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Counts of words that start with each vowel
        int a = 1;
        int e = 1;
        int i = 1;
        int o = 1;
        int u = 1;
        // Loop for n characters
        for (int count = 1; count < n; count++) {
            a += e + i + o + u;
            e += i + o + u;
            i += o + u;
            o += u;
        }
        return a + e + i + o + u;
    }
}
