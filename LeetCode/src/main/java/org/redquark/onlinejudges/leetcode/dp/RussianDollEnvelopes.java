package org.redquark.onlinejudges.leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class RussianDollEnvelopes {

    public int maxEnvelopes(int[][] envelopes) {
        // Special case
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }
        // Sort the array with height in increasing order and by
        // width in the decreasing order
        Arrays.sort(envelopes, Comparator.comparing((int[] a) -> a[0]).thenComparing((int[] a) -> a[1], Comparator.reverseOrder()));
        // List to store the valid envelopes
        List<Integer> validEnvelopes = new ArrayList<>();
        // Loop for all the envelopes
        for (int[] envelope : envelopes) {
            // Get the height of the envelope
            int currentHeight = envelope[1];
            // Check if the envelope is valid
            if (validEnvelopes.isEmpty() || currentHeight > validEnvelopes.get(validEnvelopes.size() - 1)) {
                validEnvelopes.add(currentHeight);
            } else {
                int left = 0;
                int right = validEnvelopes.size() - 1;
                while (left < right) {
                    // Middle index
                    int middle = left + (right - left) / 2;
                    if (currentHeight <= validEnvelopes.get(middle)) {
                        right = middle;
                    } else {
                        left = middle + 1;
                    }
                }
                validEnvelopes.set(right, currentHeight);
            }
        }
        return validEnvelopes.size();
    }
}
