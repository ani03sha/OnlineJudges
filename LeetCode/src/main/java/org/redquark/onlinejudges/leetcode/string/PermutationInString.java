package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        // Special case
        if (s1.length() > s2.length()) {
            return false;
        }
        // Frequency maps to store frequencies of characters
        // in the s1 and s2 strings
        int[] s1Frequencies = new int[26];
        int[] s2Frequencies = new int[26];
        // Loop over s1 length
        for (int i = 0; i < s1.length(); i++) {
            s1Frequencies[s1.charAt(i) - 'a']++;
            s2Frequencies[s2.charAt(i) - 'a']++;
        }
        // Start and end pointers of the window
        int start = 0;
        int end = s1.length();
        // Loop over the s2 string
        while (end < s2.length()) {
            // If the string in current window matches with s1
            if (matches(s1Frequencies, s2Frequencies)) {
                return true;
            }
            // Move the pointers ahead
            s2Frequencies[s2.charAt(start) - 'a']--;
            s2Frequencies[s2.charAt(end) - 'a']++;
            start++;
            end++;
        }
        return matches(s1Frequencies, s2Frequencies);
    }

    private boolean matches(int[] s1Frequencies, int[] s2Frequencies) {
        for (int i = 0; i < 26; i++) {
            if (s1Frequencies[i] != s2Frequencies[i]) {
                return false;
            }
        }
        return true;
    }
}
