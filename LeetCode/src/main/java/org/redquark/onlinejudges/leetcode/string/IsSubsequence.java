package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        // Special case - an empty string is a subsequence of every string
        if (s.isEmpty()) {
            return true;
        }
        // If s is smaller than t, then it is not possible for s
        // to be subsequence of t
        if (s.length() > t.length()) {
            return false;
        }
        // Pointers to traverse through s and t strings
        int i = 0;
        int j = 0;
        // Loop through the strings
        while (i < s.length() && j < t.length()) {
            // If the characters are matching then update the i pointer
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                // The string s will only be a subsequence if all its characters
                // are matched
                if (i == s.length()) {
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}
