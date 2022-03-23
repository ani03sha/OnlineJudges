package org.redquark.onlinejudges.leetcode.math;

/**
 * @author Anirudh Sharma
 */
public class BrokenCalculator {

    public int brokenCalc(int startValue, int target) {
        // Minimum operations needed
        int operations = 0;
        // The idea is to think in absolutely reverse order.
        // If we need to multiply startValue by 2, we will
        // divide target by 2 and if we need to subtract 1
        // from the startValue, we will add 1 to target.
        // We will do this until we make target less than
        // the startValue, and then we will reduce the startValue
        // by 1 until we reach startValue.
        while (target > startValue) {
            operations++;
            // Since we cannot divide odd numbers by 2, we will add 1
            // and if the number is even, we will divide by 2.
            target = target % 2 == 0 ? target / 2 : target + 1;
        }
        // Update minimum operations needed with the difference
        // of startValue and target, to make them equal
        return operations + startValue - target;
    }
}
