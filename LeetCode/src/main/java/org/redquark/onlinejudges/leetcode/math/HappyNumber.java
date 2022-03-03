package org.redquark.onlinejudges.leetcode.math;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        // Set to store the sum of the squares of the digits
        Set<Integer> squares = new HashSet<>();
        // Loop until we get n == 1, or we are stuck in a cycle
        // which will happen when the number is not a happy number
        while (n != 1 && squares.add(n)) {
            // Get the next number
            n = getSumOfSquaresOfDigits(n);
        }
        return n == 1;
    }

    private int getSumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            sum += digit * digit;
        }
        return sum;
    }
}
