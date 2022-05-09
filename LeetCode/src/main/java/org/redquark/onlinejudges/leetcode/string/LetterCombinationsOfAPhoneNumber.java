package org.redquark.onlinejudges.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        // List to store the combinations
        List<String> combinations = new ArrayList<>();
        // Special case
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        // Mappings with numbers and characters
        String[] mappings = new String[]{
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        findCombinations("", digits, 0, combinations, mappings);
        return combinations;
    }

    private void findCombinations(String current, String digits, int index, List<String> combinations, String[] mappings) {
        if (index >= digits.length()) {
            combinations.add(current);
            return;
        }
        String characters = mappings[digits.charAt(index) - '0'];
        // Loop for every character
        for (int i = 0; i < characters.length(); i++) {
            findCombinations(current + characters.charAt(i), digits, index + 1, combinations, mappings);
        }
    }
}
