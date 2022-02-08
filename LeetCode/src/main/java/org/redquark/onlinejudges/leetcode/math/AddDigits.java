package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class AddDigits {

    public int addDigitsSolutionOne(int num) {
        if (num < 9) {
            return num;
        }
        int currentSum = 0;
        while (num > 0) {
            currentSum += num % 10;
            num /= 10;
        }
        return addDigitsSolutionOne(currentSum);
    }

    public int addDigitsSolutionTwo(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
