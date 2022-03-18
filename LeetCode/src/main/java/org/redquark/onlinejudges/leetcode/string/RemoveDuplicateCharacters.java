package org.redquark.onlinejudges.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class RemoveDuplicateCharacters {

    public String removeDuplicateLetters(String s) {
        // Special case
        if (s == null || s.length() <= 1) {
            return s;
        }
        // Map to store the last position of every character
        // in the given string
        Map<Character, Integer> lastPositionMap = new HashMap<>();
        // Populate the array
        for (int i = 0; i < s.length(); i++) {
            lastPositionMap.put(s.charAt(i), i);
        }
        // Total number of unique characters
        int uniqueCount = lastPositionMap.size();
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        // Now, we will find the smallest character in a range
        // determined by the last indices of characters in map
        // For that, we require start and end pointers
        int start = 0;
        int end = findMinimumLastPosition(lastPositionMap);
        // Loop through all the characters in the map
        for (int i = 0; i < uniqueCount; i++) {
            // Smallest character
            char smallest = 'z' + 1;
            // Loop through the characters in the window
            for (int j = start; j <= end; j++) {
                if (lastPositionMap.containsKey(s.charAt(j))
                        && s.charAt(j) < smallest) {
                    smallest = s.charAt(j);
                    start = j + 1;
                }
            }
            // Add the smallest character to the result
            result.append(smallest);
            // If we have considered all the characters
            if (i == uniqueCount - 1) {
                break;
            }
            // Remove the considered character from the map
            lastPositionMap.remove(smallest);
            // Update the end index
            if (smallest == s.charAt(end)) {
                end = findMinimumLastPosition(lastPositionMap);
            }
        }
        return result.toString();
    }

    private int findMinimumLastPosition(Map<Character, Integer> lastPositionMap) {
        if (lastPositionMap == null || lastPositionMap.isEmpty()) {
            return -1;
        }
        // Minimum index
        int minimumIndex = Integer.MAX_VALUE;
        // Find the minimum index from the map
        for (int lastPosition : lastPositionMap.values()) {
            minimumIndex = Math.min(lastPosition, minimumIndex);
        }
        return minimumIndex;
    }
}
