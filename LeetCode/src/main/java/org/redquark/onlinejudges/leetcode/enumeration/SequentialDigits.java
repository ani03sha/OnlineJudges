package org.redquark.onlinejudges.leetcode.enumeration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class SequentialDigits {

    public List<Integer> sequentialDigits(int low, int high) {
        // List to store the final output
        List<Integer> sequentials = new ArrayList<>();
        // Queue to store the potential candidates
        Queue<Integer> potentialCandidates = new LinkedList<>();
        // Base initializations
        if (low <= 0 && high >= 0) {
            potentialCandidates.offer(0);
        }
        // Add first 9 digits to the queue
        for (int i = 1; i <= 9; i++) {
            potentialCandidates.offer(i);
        }
        // Loop until the queue is empty
        while (!potentialCandidates.isEmpty()) {
            // Get the current digit
            int current = potentialCandidates.poll();
            // Check if the digit is in the range
            if (current >= low && current <= high) {
                sequentials.add(current);
            }
            // Get the next sequential digit
            int onesDigit = current % 10;
            if (onesDigit < 9 && current * 10 + onesDigit + 1 <= high) {
                potentialCandidates.offer(current * 10 + onesDigit + 1);
            }
        }
        return sequentials;
    }
}
