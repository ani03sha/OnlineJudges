package org.redquark.onlinejudges.leetcode.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class ShortEncodingOfWords {

    public int minimumLengthEncoding(String[] words) {
        // Set to store the words
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        // Loop for each word in the array
        for (String word : words) {
            // Check if the set contains the word
            if (wordSet.contains(word)) {
                for (int i = 1; i < word.length(); i++) {
                    wordSet.remove(word.substring(i));
                }
            }
        }
        // Shortest length encoding
        int length = wordSet.size();
        // Loop for each word in the set and add its
        // length
        for (String word : wordSet) {
            length += word.length();
        }
        return length;
    }
}
