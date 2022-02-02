package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        // List to store the indices of the anagrams
        List<Integer> anagramIndices = new ArrayList<>();
        // Special cases
        if (s == null || p == null || s.isEmpty() || p.isEmpty() || s.length() < p.length()) {
            return anagramIndices;
        }
        // Array to store the count of characters in the string p
        int[] pCharacterCount = new int[26];
        // Populate the array
        for (char c : p.toCharArray()) {
            pCharacterCount[c - 'a']++;
        }
        // Start and end pointers of the sliding window
        int start = 0;
        int end = 0;
        // Count of characters in the string p
        int pCount = p.length();
        // Loop through the string s
        while (end < s.length()) {
            // Current character
            char c = s.charAt(end);
            // If the current character is present in the pCharacterCount array,
            // It means the current character can be part of the anagram
            if (pCharacterCount[c - 'a'] >= 1) {
                pCount--;
            }
            // Decrement the count of current character in the pCharacterCount array
            pCharacterCount[c - 'a']--;
            end++;
            // If pCount is 0, then it means, we have found the anagram of p in s
            if (pCount == 0) {
                anagramIndices.add(start);
            }
            // If the size of window is equal to the length of the string p,
            // we will repopulate the pCharacterCount array and move left
            if (end - start == p.length()) {
                char startCharacter = s.charAt(start);
                if (pCharacterCount[startCharacter - 'a'] >= 0) {
                    pCount++;
                }
                pCharacterCount[startCharacter - 'a']++;
                start++;
            }
        }
        return anagramIndices;
    }
}
