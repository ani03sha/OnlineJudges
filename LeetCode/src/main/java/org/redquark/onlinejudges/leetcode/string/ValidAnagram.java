package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        // Base case
        if (s.length() != t.length()) {
            return false;
        }
        // Array to store the frequencies of characters in s and t
        int[] frequencies = new int[26];
        // Loop through s and t
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }
        // Loop through frequencies array and return false
        // if value at any index is other than zero
        for (int frequency : frequencies) {
            if (frequency != 0) {
                return false;
            }
        }
        return true;
    }
}
