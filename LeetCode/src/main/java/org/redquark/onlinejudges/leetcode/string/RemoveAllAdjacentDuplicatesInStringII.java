package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RemoveAllAdjacentDuplicatesInStringII {

    public String removeDuplicates(String s, int k) {
        // Special case
        if (s == null || s.length() < k) {
            return s;
        }
        // Array to store the frequencies of duplicate characters
        // which are present before the current character and
        // including the current character
        int[] frequencies = new int[s.length()];
        // Store the string s in StringBuilder object for easy removal
        StringBuilder reference = new StringBuilder(s);
        // Loop through the string
        for (int i = 0; i < reference.length(); i++) {
            // If the adjacent characters are unequal, then we will
            // mark the frequency as 1
            if (i == 0 || reference.charAt(i) != reference.charAt(i - 1)) {
                frequencies[i] = 1;
            }
            // If the consecutive characters are equal, we will update the
            // frequencies accordingly
            else {
                frequencies[i] = frequencies[i - 1] + 1;
                // If the current frequency becomes k, we will delete
                // the previous k characters
                if (frequencies[i] == k) {
                    reference.delete(i - k + 1, i + 1);
                    i -= k;
                }
            }
        }
        return reference.toString();
    }
}
