package org.redquark.onlinejudges.leetcode.dp;

/**
 * @author Anirudh Sharma
 */
public class SuperEggDrop {

    // Lookup table to store the minimum attempts
    // needed to find critical floor with i eggs
    // and j floors
    private final Integer[][] lookup = new Integer[101][10001];

    public int superEggDrop(int k, int n) {
        // Some base cases
        // 1. If there is only one egg
        // 2. If there is only 0 or 1 floor
        if (k == 1 || n <= 1) {
            return n;
        }
        // 3. If we have already calculated the result
        // using memoization
        if (lookup[k][n] != null) {
            return lookup[k][n];
        }
        // Minimum attempts needed to find critical floor
        int minimum = Integer.MAX_VALUE;
        // Search for the critical floor using binary search
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle point
            int middle = left + (right - left) / 2;
            // If egg breaks, search below
            int below = superEggDrop(k - 1, middle - 1);
            // If egg survives, search above
            int above = superEggDrop(k, n - middle);
            // We need worst case from both attempts
            // 1 is added because we have tried once
            // for the middle floor
            int attempts = 1 + Math.max(below, above);
            // If below attempts are less, we need only above
            // attempts and vice-versa
            if (below < above) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            // Minimum attempts for all worst cases
            minimum = Math.min(minimum, attempts);
        }
        return lookup[k][n] = minimum;
    }
}
