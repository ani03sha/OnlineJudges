package org.redquark.onlinejudges.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        // Special case
        if (pattern == null || pattern.isEmpty() || s == null || s.isEmpty()) {
            return false;
        }
        // Split the string using the space to get individual words
        String[] words = s.split(" ");
        // If the length of pattern and total number of words are different,
        // the output should be false
        if (words.length != pattern.length()) {
            return false;
        }
        // Map to store the mapping of character as key and word as value
        Map<Character, String> mappings = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            // Current character
            char c = pattern.charAt(i);
            // If the key is already present and its corresponding value is
            // not equal to the current word, we shall return false
            if (mappings.containsKey(c)) {
                if (!mappings.get(c).equals(words[i])) {
                    return false;
                }
            }
            // If the key is not present but the value is present, it means that
            // value is associated with some other key, we shall return false
            else {
                if (mappings.containsValue(words[i])) {
                    return false;
                }
            }
            mappings.put(c, words[i]);
        }
        return true;
    }
}
