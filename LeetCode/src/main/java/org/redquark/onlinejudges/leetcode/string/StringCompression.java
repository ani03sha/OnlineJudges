package org.redquark.onlinejudges.leetcode.string;

public class StringCompression {

    public int compress(char[] chars) {
        // Special cases
        if (chars == null || chars.length == 0) {
            return 0;
        }
        // To keep track of length of compressed array
        int index = 0;
        // Loop through the array character by character
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                i++;
                count++;
            }
            // Append the character
            chars[index++] = chars[i];
            // If count is greater than one, then we will need to append
            // that count in the chars array
            if (count > 1) {
                String countString = String.valueOf(count);
                for (char c : countString.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}
