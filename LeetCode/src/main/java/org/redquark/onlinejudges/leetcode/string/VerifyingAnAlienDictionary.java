package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        // Special case
        if (words == null || words.length == 0 || order == null || order.isEmpty()) {
            return false;
        }
        // Mapper to store the index of characters in order
        int[] mapper = new int[26];
        // Populate the mapper
        for (int i = 0; i < order.length(); i++) {
            mapper[order.charAt(i) - 'a'] = i;
        }
        // Loop through the words array
        for (int i = 0; i < words.length - 1; i++) {
            // Check if the words are in wrong order
            if (isIncorrectOrder(words[i], words[i + 1], mapper)) {
                return false;
            }
        }
        return true;
    }

    private boolean isIncorrectOrder(String a, String b, int[] mapper) {
        // Lengths of the words
        int m = a.length();
        int n = b.length();
        // Loop through the words
        for (int i = 0; i < m && i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return mapper[a.charAt(i) - 'a'] > mapper[b.charAt(i) - 'a'];
            }
        }
        return m > n;
    }
}
