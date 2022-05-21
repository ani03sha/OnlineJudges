package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        // Special case
        if (x < 0) {
            return false;
        }
        // Variable to store the original number
        int original = x;
        // Variable to store the constructed number
        long reversed = 0;
        // Loop until x is not zero
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
