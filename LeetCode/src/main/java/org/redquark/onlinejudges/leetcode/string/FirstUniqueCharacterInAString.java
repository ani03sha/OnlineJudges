package org.redquark.onlinejudges.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

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

    public int firstUniqCharForVeryLargeStrings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return -1;
        }
        // Map to store the frequencies of the characters.
        // We will choose LinkedHashMap because it maintains
        // the insertion order
        Map<Character, Integer> frequencies = new LinkedHashMap<>();
        // Populate the map
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        // Unique character
        char uniqueCharacter = '\u0000';
        // Now, the first unique character would be the one which
        // has frequency of 1, and it comes first in the map.
        // Like the previous solution, we could have traversed the
        // string again but in case of very large strings and very
        // small set of characters which make that string, it is optimal
        // to traverse through the LinkedHashMap.
        // For example, a DNA string which comprises only four
        // characters - A, T, C and G.
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueCharacter = entry.getKey();
                break;
            }
        }
        return uniqueCharacter == '\u0000' ? -1 : s.indexOf(uniqueCharacter);
    }
}
