package org.redquark.onlinejudges.leetcode.string;

public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        // Special cases
        if (word1 == null || word1.isEmpty()) {
            return word2;
        }
        if (word2 == null || word2.isEmpty()) {
            return word1;
        }
        // Lengths of both the strings
        int m = word1.length();
        int n = word2.length();
        // Pointers to traverse through the strings
        int i = 0;
        int j = 0;
        // StringBuilder to store the merged string
        StringBuilder mergedString = new StringBuilder();
        // Traverse the strings
        while (i < m && j < n) {
            mergedString.append(word1.charAt(i)).append(word2.charAt(j));
            i++;
            j++;
        }
        // If there are any characters left in word1
        while (i < m) {
            mergedString.append(word1.charAt(i));
            i++;
        }
        // If there are any characters left in word2
        while (j < n) {
            mergedString.append(word2.charAt(j));
            j++;
        }
        return mergedString.toString();
    }
}
