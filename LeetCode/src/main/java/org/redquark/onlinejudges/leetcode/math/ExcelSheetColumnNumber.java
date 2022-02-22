package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        // Special case
        if (columnTitle == null || columnTitle.isEmpty()) {
            throw new IllegalArgumentException("Invalid column title!");
        }
        // Variable to store the column number
        int column = 0;
        // Loop through the string
        for (char c : columnTitle.toCharArray()) {
            // First we will multiply the column with 26 to
            // determine the weight of the character in string
            column *= 26;
            // Now add the character position
            column += c - 'A' + 1;
        }
        return column;
    }
}
