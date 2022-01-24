package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        // Special case
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        // Length of the word
        int n = word.length();
        // Check if the first character of the word is capital
        if (isCapital(word.charAt(0))) {
            // Count of capital letters
            int count = 1;
            // There can be two valid cases from here -
            // 1. All the words are capital
            // 2. All the remaining words are small
            for (int i = 1; i < n; i++) {
                if (isCapital(word.charAt(i))) {
                    count++;
                }
            }
            // At the end of the loop, for valid capitalization, the
            // count should either be 1 or length of the word
            return count == 1 || count == n;
        }
        // If the first word is not capital, then the remaining words
        // out to be small
        else {
            for (int i = 1; i < n; i++) {
                if (isCapital(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isCapital(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
