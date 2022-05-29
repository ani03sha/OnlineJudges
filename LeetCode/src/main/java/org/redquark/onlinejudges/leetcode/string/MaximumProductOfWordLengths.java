package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class MaximumProductOfWordLengths {

    public int maxProduct(String[] words) {
        // Special case
        if (words == null || words.length < 2) {
            return 0;
        }
        // Length of the string
        int n = words.length;
        // Table to store the bit version of every word
        int[] encodedWords = new int[n];
        // Traverse the array for every word
        for (int i = 0; i < n; i++) {
            // Current word
            String word = words[i];
            for (int j = 0; j < words[i].length(); j++) {
                // Current character
                char c = word.charAt(j);
                encodedWords[i] |= (1 << (c - 'a'));
            }
        }
        // Maximum length
        int maxLength = 0;
        // Loop for every pair of words
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If the characters don't match
                if ((encodedWords[i] & encodedWords[j]) == 0) {
                    maxLength = Math.max(maxLength, words[i].length() * words[j].length());
                }
            }
        }
        return maxLength;
    }
}
