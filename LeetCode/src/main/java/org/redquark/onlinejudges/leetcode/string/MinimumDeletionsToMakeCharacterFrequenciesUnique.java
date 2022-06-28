package org.redquark.onlinejudges.leetcode.string;

import java.util.Arrays;

/**
 * @author Anirudh Sharma
 */
public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

    public int minDeletions(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Array to store the frequencies of all the
        // characters in the string
        int[] frequencies = new int[26];
        // Populate the array
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        // Sort the frequencies array
        Arrays.sort(frequencies);
        // Characters to be deleted
        int charactersToBeDeleted = 0;
        // Maximum frequency a character can have
        int maxCharacterFrequency = s.length();
        // Loop through the frequencies array
        for (int i = 25; i >= 0 && frequencies[i] > 0; i--) {
            // Delete the characters to make the frequency
            // equal the maximum frequency allowed
            if (frequencies[i] > maxCharacterFrequency) {
                charactersToBeDeleted += frequencies[i] - maxCharacterFrequency;
                frequencies[i] = maxCharacterFrequency;
            }
            // Update the max character frequency
            maxCharacterFrequency = Math.max(0, frequencies[i] - 1);
        }
        return charactersToBeDeleted;
    }
}
