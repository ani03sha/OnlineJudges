package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class JumpGameII {

    public int jump(int[] a) {
        // Current position
        int currentPosition = 0;
        // Destination reached from an index
        int destination = 0;
        // Total number of jumps
        int jumps = 0;
        // loop through the array
        for (int i = 0; i < a.length - 1; i++) {
            // Destination index will be maximum of current position
            // and the index that can be reached from here
            destination = Math.max(destination, i + a[i]);
            // If we take jump
            if (i == currentPosition) {
                currentPosition = destination;
                jumps++;
            }
        }
        return jumps;
    }
}
