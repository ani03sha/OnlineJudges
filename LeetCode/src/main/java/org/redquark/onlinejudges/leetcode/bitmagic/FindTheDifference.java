package org.redquark.onlinejudges.leetcode.bitmagic;

/**
 * @author Anirudh Sharma
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        // Array to store frequencies of characters in s
        int[] characterFrequencies = new int[26];
        // Populate the character frequencies
        for (int i = 0; i < s.length(); i++) {
            characterFrequencies[s.charAt(i) - 'a']++;
            characterFrequencies[t.charAt(i) - 'a']--;
        }
        char differentCharacter = '\u0000';
        // For the last character in t
        characterFrequencies[t.charAt(t.length() - 1) - 'a']--;
        // Loop through the character frequencies array
        for (int i = 0; i < 26; i++) {
            if (characterFrequencies[i] == -1) {
                differentCharacter = (char) (i + 97);
            }
        }
        return differentCharacter;
    }
}
