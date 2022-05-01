package org.redquark.onlinejudges.leetcode.string;

import java.util.Objects;

/**
 * @author Anirudh Sharma
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            return Objects.equals(s, t);
        }
        // Pointers to traverse through the strings
        int i = s.length() - 1;
        int j = t.length() - 1;
        // Counters to keep track of the "#" characters
        int sCount = 0;
        int tCount = 0;
        // Loop through the strings from right to left
        while (i >= 0 || j >= 0) {
            // For the string "s"
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    sCount++;
                    i--;
                } else if (sCount > 0) {
                    sCount--;
                    i--;
                } else {
                    break;
                }
            }
            // For the string "t"
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    tCount++;
                    j--;
                } else if (tCount > 0) {
                    tCount--;
                    j--;
                } else {
                    break;
                }
            }
            // If the current two characters are different
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            // If one string has more characters than the other
            if ((i >= 0) != (j >= 0)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
