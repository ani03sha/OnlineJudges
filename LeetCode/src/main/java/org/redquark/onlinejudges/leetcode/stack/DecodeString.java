package org.redquark.onlinejudges.leetcode.stack;

import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class DecodeString {

    public String decodeString(String s) {
        // StringBuilder to store the decoded string
        StringBuilder decodedString = new StringBuilder();
        // Special case
        if (s == null || s.isEmpty()) {
            return decodedString.toString();
        }
        // Stack to store the counts of substrings
        Stack<Integer> counts = new Stack<>();
        // Stack to store the substrings which need to be repeated
        Stack<String> parts = new Stack<>();
        // Loop through each character of the string
        int index = 0;
        while (index < s.length()) {
            // Current character
            char c = s.charAt(index);
            // If the current character is a digit
            if (Character.isDigit(c)) {
                // We will calculate the number
                int k = 0;
                while (Character.isDigit(s.charAt(index))) {
                    k = k * 10 + s.charAt(index) - '0';
                    index++;
                }
                // Push this count in the count stack
                counts.push(k);
            }
            // If the current character is an opening bracket
            else if (c == '[') {
                // We now have to push the already calculated
                // string and push it to the stack
                parts.push(decodedString.toString());
                // Reset the decodedString
                decodedString = new StringBuilder();
                index++;
            }
            // If the current character is a closing bracket
            else if (c == ']') {
                // Now we will have to repeat the string count number
                // of times.
                // First get the string to be repeated
                StringBuilder temp = new StringBuilder(parts.pop());
                // Get the count
                int k = counts.pop();
                // Append the repeated strings
                temp.append(String.valueOf(decodedString).repeat(Math.max(0, k)));
                decodedString = temp;
                index++;
            }
            // If the current character is a letter, simply append it
            else {
                decodedString.append(c);
                index++;
            }
        }
        return decodedString.toString();
    }
}
