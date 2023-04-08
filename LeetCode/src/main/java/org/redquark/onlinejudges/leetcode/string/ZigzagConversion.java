package org.redquark.onlinejudges.leetcode.string;

import java.util.Arrays;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        // Special case
        if (s == null || s.isEmpty() || numRows <= 0) {
            return "";
        }
        // Length of the string
        int n = s.length();
        // Array of string builders to store each row
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        // Initialize the objects in the arrays
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        // Index to keep track of all characters in the string
        int index = 0;
        // Loop through every character in the string
        while (index < n) {
            // Go vertically down
            for (int i = 0; i < numRows && index < n; i++) {
                stringBuilders[i].append(s.charAt(index));
                index++;
            }
            // Go obliquely up
            for (int i = numRows - 2; i > 0 && index < n; i--) {
                stringBuilders[i].append(s.charAt(index));
                index++;
            }
        }
        System.out.println(Arrays.toString(stringBuilders));
        // Now combine all the string builders in one string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(stringBuilders[i]);
        }
        return result.toString();
    }
}
