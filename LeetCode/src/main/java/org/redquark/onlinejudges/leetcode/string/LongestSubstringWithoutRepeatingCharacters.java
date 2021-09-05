package org.redquark.onlinejudges.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Length of the string
        int n = s.length();
        // Length of the longest substring without repeating characters
        int maxLength = 0;
        // Start and end pointers of the window
        int start = 0;
        int end = 0;
        // Set to store the characters of the current window
        Set<Character> distinctCharacters = new HashSet<>();
        // Loop until end reaches to the end of the string
        while (end < n) {
            if (distinctCharacters.add(s.charAt(end))) {
                end++;
            } else {
                distinctCharacters.remove(s.charAt(start));
                start++;
            }
            maxLength = Math.max(maxLength, distinctCharacters.size());
        }
        return maxLength;
    }
}
