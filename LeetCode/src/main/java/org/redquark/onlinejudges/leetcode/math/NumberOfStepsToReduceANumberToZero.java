package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        // Special case
        if (num == 0) {
            return 0;
        }
        // Total number of steps
        int steps = 0;
        // Loop until the num becomes zero
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }
}
