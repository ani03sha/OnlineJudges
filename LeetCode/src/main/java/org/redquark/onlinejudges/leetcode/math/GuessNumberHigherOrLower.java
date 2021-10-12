package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class GuessNumberHigherOrLower {

    protected int pick = 0;

    public int guessNumber(int n) {
        // Invalid cases
        if (n <= 0) {
            return -1;
        }
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until left and right pointers meet
        while (left < right) {
            // Middle point of the current window
            int middle = left + (right - left) / 2;
            // If the number is found
            if (guess(middle) == 0) {
                return middle;
            }
            // If the picked number is smaller than the middle
            else if (guess(middle) > 0) {
                left = middle + 1;
            }
            // If the picked number is greater than the middle
            else {
                right = middle;
            }
        }
        return left;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
