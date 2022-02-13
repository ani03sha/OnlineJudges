package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class CountOperationsToObtainZero {

    public int countOperationsSolutionOne(int num1, int num2) {
        // Special case
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        // Count of operations
        int operations = 0;
        // Loop until either of num1 or num2 becomes 0
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            operations++;
        }
        return operations;
    }

    public int countOperationsSolutionTwo(int num1, int num2) {
        // Special case
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        // Count of operations
        int operations = 0;
        // Loop until either of num1 or num2 becomes 0
        while (num1 != 0) {
            if (num1 < num2) {
                // Swap
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            operations += num1 / num2;
            num1 %= num2;
        }
        return operations;
    }
}
