package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        // Special case
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs");
        }
        // String to store final output
        StringBuilder result = new StringBuilder();
        // Pointers to traverse through the strings
        int i = a.length() - 1;
        int j = b.length() - 1;
        // Variable to track carry
        int carry = 0;
        int sum;
        // Loop through the strings from right to left
        while (i >= 0 && j >= 0) {
            sum = carry + a.charAt(i) - '0' + b.charAt(j) - '0';
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        // This loop will run if a is longer than b
        while (i >= 0) {
            sum = carry + a.charAt(i) - '0';
            result.append(sum % 2);
            carry = sum / 2;
            i--;
        }
        // This loop will run if b is longer than a
        while (j >= 0) {
            sum = carry + b.charAt(j) - '0';
            result.append(sum % 2);
            carry = sum / 2;
            j--;
        }
        // Add carry, if not zero
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
