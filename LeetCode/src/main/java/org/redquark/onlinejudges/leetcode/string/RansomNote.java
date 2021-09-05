package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        // Special case
        if (ransomNote == null || ransomNote.isEmpty() || magazine == null || magazine.isEmpty()) {
            return false;
        }
        // Map to store the character frequency of magazine words
        int[] magazineMap = new int[26];
        // Loop through the characters of magazine
        for (char c : magazine.toCharArray()) {
            magazineMap[c - 'a']++;
        }
        // Loop through the characters of ransom note
        for (char c : ransomNote.toCharArray()) {
            if (magazineMap[c - 'a'] <= 0) {
                return false;
            }
            magazineMap[c - 'a']--;
        }
        return true;
    }
}
