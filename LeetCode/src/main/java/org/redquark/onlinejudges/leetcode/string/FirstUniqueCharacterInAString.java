package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        // Base case
        if (s == null || s.isEmpty()) {
            return -1;
        }
        // Array to store the frequencies of characters
        int[] frequencies = new int[26];
        // Loop through the loop to populate the array
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
        }
        // Again loop through the string to find out the
        // character which has frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencies[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
