package org.redquark.onlinejudges.leetcode.string;

public class ValidPalindrome {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n) (String is immutable in Java)
     */
    public boolean isPalindromeBruteForce(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Create a new string with only alphanumeric characters
        StringBuilder alphanumerics = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (c >= '0' && c <= '9')) {
                alphanumerics.append(Character.toLowerCase(c));
            }
        }
        // Create a new string with only alphanumerics but in reverse order
        StringBuilder reverseAlphanumerics = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (c >= '0' && c <= '9')) {
                reverseAlphanumerics.append(Character.toLowerCase(c));
            }
        }
        // Check if both are equal or not
        return alphanumerics.toString().equals(reverseAlphanumerics.toString());
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(n) (String is immutable in Java)
     */
    public boolean isPalindromeSuboptimal(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Remove all the non-alphabets from the string
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        // Convert the string to lower case for easy comparisons
        s = s.toLowerCase();
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // If the characters at left and right pointers are not same,
            // it means the string is not palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     */
    public boolean isPalindromeOptimal(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Characters at left and right pointers
        char leftCharacter;
        char rightCharacter;
        // Loop until the pointers meet
        while (left <= right) {
            leftCharacter = s.charAt(left);
            rightCharacter = s.charAt(right);
            // Check if the left and right characters are not alphabets
            if (!Character.isLetterOrDigit(leftCharacter)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightCharacter)) {
                right--;
            }
            // If the characters are alphabets, we will check they are same
            else {
                if (Character.toLowerCase(leftCharacter) != Character.toLowerCase(rightCharacter)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
