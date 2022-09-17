package org.redquark.onlinejudges.leetcode.string;

public class LongestPalindrome {

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public int longestPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Array to store the frequencies of the characters
        // in the given string
        int[] frequencies = new int[127];
        // Loop through the string to calculate the frequencies
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i)]++;
        }
        // Longest length of the palindromic string
        int longest = 0;
        for (int frequency : frequencies) {
            longest += frequency / 2 * 2;
            // We can choose one single character
            if (longest % 2 == 0 && frequency % 2 == 1) {
                longest++;
            }
        }
        return longest;
    }
}
