package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // List to store the group anagrams
        List<List<String>> groups = new ArrayList<>();
        // Special case
        if (strs == null || strs.length == 0) {
            return groups;
        }
        // Since anagrams have same characters (just in different order),
        // the frequencies of characters in anagrams will be same.
        // We can use this information to make them key and all the anagrams
        // corresponding to this key as list of strings which are the
        // actual strings in the array
        Map<String, List<String>> mappings = new HashMap<>();
        // Loop through the array
        for (String str : strs) {
            // Character array to store the frequencies of characters in the
            // current string
            char[] frequencies = new char[26];
            // Populate then frequencies array
            for (char c : str.toCharArray()) {
                frequencies[c - 'a']++;
            }
            // Use the frequencies' character array to create the key
            // for the mappings
            String key = String.valueOf(frequencies);
            mappings.putIfAbsent(key, new LinkedList<>());
            mappings.get(key).add(str);
        }
        // Add the values in the mappings to the final output
        groups.addAll(mappings.values());
        return groups;
    }
}
