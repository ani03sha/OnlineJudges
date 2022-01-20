package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        // Special case
        if (piles == null || piles.length == 0) {
            throw new IllegalArgumentException("No bananas for Koko :(");
        }
        // Minimum speed at which Koko can eat banana would be 1 banana
        // per hour and maximum speed would be the maximum number of bananas
        // in one pile. Our desired speed will be found between the two.
        int left = 1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        // Perform binary search to find the optimal speed
        while (left < right) {
            // Middle point
            int middle = left + (right - left) / 2;
            // Total hours taken with the banana eating speed equal to middle
            int hours = 0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / middle);
            }
            // Check if the middle is workable speed or not
            if (hours <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }
}
