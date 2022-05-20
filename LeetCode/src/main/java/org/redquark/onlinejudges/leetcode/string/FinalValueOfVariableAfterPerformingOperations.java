package org.redquark.onlinejudges.leetcode.string;

/**
 * @author Anirudh Sharma
 */
public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        // Special case
        if (operations == null || operations.length == 0) {
            return 0;
        }
        // Variable to keep track of value of x
        int x = 0;
        // Loop through the operations array
        for (String operation : operations) {
            x += operation.charAt(1) == '+' ? 1 : -1;
        }
        return x;
    }
}
