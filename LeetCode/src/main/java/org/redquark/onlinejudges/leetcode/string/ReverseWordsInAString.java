package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class ReverseWordsInAString {

    public String reverseWords(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Split the words in string by space
        String[] words = s.split(" ");
        // Output
        StringBuilder output = new StringBuilder();
        // Loop from right to left
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                output.append(words[i]).append(" ");
            }
        }
        return output.length() == 0 ? "" : output.substring(0, output.length() - 1);
    }

}
