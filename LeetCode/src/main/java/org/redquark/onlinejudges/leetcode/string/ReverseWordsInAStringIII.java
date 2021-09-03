package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Split the string by spaces
        String[] words = s.split(" ");
        // StringBuilder to store output
        StringBuilder output = new StringBuilder();
        // Reverse each word
        for (String word : words) {
            output.append(reverse(word)).append(" ");
        }
        return output.substring(0, output.length() - 1);
    }

    private char[] reverse(String word) {
        char[] characters = word.toCharArray();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return characters;
    }
}
