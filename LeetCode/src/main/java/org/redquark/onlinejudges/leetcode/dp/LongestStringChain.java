package org.redquark.onlinejudges.leetcode.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class LongestStringChain {

    public int longestStrChain(String[] words) {
        // Special case
        if (words == null || words.length == 0) {
            return 0;
        }
        // Sort the words in the array by their lengths
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // Lookup table to store the length of the longest chain
        Map<String, Integer> lookup = new HashMap<>();
        // Maximum length of the chain
        int maxLength = 0;
        // Loop through the array
        for (String word : words) {
            // Current longest length
            int currentLength = 0;
            for (int i = 0; i < word.length(); i++) {
                String previous = word.substring(0, i) + word.substring(i + 1);
                currentLength = Math.max(currentLength, lookup.getOrDefault(previous, 0) + 1);
            }
            lookup.put(word, currentLength);
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
