package org.redquark.onlinejudges.leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ReorganizeString {

    public String reorganizeString(String s) {
        // String to store the output
        StringBuilder output = new StringBuilder();
        // Special case
        if (s == null || s.isEmpty()) {
            return output.toString();
        }
        // Map to store the frequencies of characters in the string
        final Map<Character, Integer> frequencies = new HashMap<>();
        // Populate the frequencies map
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        // Max heap to store the characters based on the frequencies
        Queue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencies.get(b) - frequencies.get(a));
        // Now add all the keys in the map to the heap
        maxHeap.addAll(frequencies.keySet());
        // Loop until one element is remaining in the heap
        while (maxHeap.size() > 1) {
            // Find the first and second most frequent characters
            char mostFrequentCharacter = maxHeap.remove();
            char secondMostFrequentCharacter = maxHeap.remove();
            // Add these characters to the output
            output.append(mostFrequentCharacter).append(secondMostFrequentCharacter);
            // Update the frequencies of these characters in the map
            frequencies.put(mostFrequentCharacter, frequencies.get(mostFrequentCharacter) - 1);
            frequencies.put(secondMostFrequentCharacter, frequencies.get(secondMostFrequentCharacter) - 1);
            // If their counts are greater than zero, then we will have to put
            // them back in the heap for further processing
            if (frequencies.get(mostFrequentCharacter) > 0) {
                maxHeap.add(mostFrequentCharacter);
            }
            if (frequencies.get(secondMostFrequentCharacter) > 0) {
                maxHeap.add(secondMostFrequentCharacter);
            }
        }
        // Process for the last character in the heap
        if (!maxHeap.isEmpty()) {
            char lastCharacter = maxHeap.remove();
            // Check if we can add it to the output or not
            if (frequencies.get(lastCharacter) > 1) {
                return "";
            }
            output.append(lastCharacter);
        }
        return output.toString();

    }
}
