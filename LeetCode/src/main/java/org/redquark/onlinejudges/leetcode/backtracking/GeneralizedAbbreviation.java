package org.redquark.onlinejudges.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation {

    /**
     * Time complexity - O(2 ^ n)
     * Space complexity - O(2 ^ n)
     */
    public List<String> generateAbbreviations(String word) {
        // List to store all the abbreviations
        List<String> abbreviations = new ArrayList<>();
        // Special case
        if (word == null || word.isEmpty()) {
            return abbreviations;
        }
        // Perform backtracking
        backtrack(word, "", 0, 0, abbreviations);
        return abbreviations;
    }

    private void backtrack(String word, String abbreviation, int index, int count, List<String> abbreviations) {
        // Base case - when we have traversed the whole word
        if (index == word.length()) {
            if (count > 0) {
                abbreviation += count;
            }
            abbreviations.add(abbreviation);
            return;
        }
        // Abbreviate the current character
        backtrack(word, abbreviation, index + 1, count + 1, abbreviations);
        // Keep the current character
        backtrack(word, abbreviation + (count > 0 ? count : "") + word.charAt(index), index + 1, 0, abbreviations);
    }
}
