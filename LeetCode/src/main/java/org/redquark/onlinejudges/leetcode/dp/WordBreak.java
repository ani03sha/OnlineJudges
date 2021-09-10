package org.redquark.onlinejudges.leetcode.dp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Length of the string
        int n = s.length();
        // Store all words in wordDict in a set for constant time lookup
        Set<String> words = new HashSet<>(wordDict);
        // Lookup array to define if the word fragment at i-th index and
        // after is possible or not
        boolean[] lookup = new boolean[n + 1];
        lookup[0] = true;
        // Populate the remaining table
        for (int i = 0; i < n; i++) {
            if (lookup[i]) {
                for (int j = i + 1; j <= n; j++) {
                    // Get the words between indices i and j
                    String word = s.substring(i, j);
                    // Check if this word is present in dictionary
                    if (words.contains(word)) {
                        lookup[j] = true;
                    }
                }
            }
        }
        return lookup[n];
    }
}
