package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        // Output string
        StringBuilder longestCommonPrefix = new StringBuilder();
        // Special case
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        // Find the length of the smallest length string
        int smallestLength = Integer.MAX_VALUE;
        for (String str : strs) {
            smallestLength = Math.min(smallestLength, str.length());
        }
        // Loop through all strings and return once the characters mismatch
        for (int i = 0; i < smallestLength; i++) {
            // Current character
            char current = strs[0].charAt(i);
            // Check if this character is found in every string at the current index
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}
