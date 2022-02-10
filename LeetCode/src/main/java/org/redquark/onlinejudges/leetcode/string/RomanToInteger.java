package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Invalid Roman string");
        }
        // Variable to store the final integer value
        int value = 0;
        // Loop through the string
        for (int i = s.length() - 1; i >= 0; i--) {
            // Add the value corresponding to the current symbol
            value += romanToInt(s.charAt(i));
            // Check if the character previous to the current
            // character is smaller than the current character
            // in roman numerals.
            if (i > 0 && romanToInt(s.charAt(i - 1)) < romanToInt(s.charAt(i))) {
                // Subtract the value corresponding to the roman
                // character at i - 1
                value -= romanToInt(s.charAt(i - 1));
                i--;
            }
        }
        return value;
    }

    private int romanToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid character");
        };
    }
}
