package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        // Special case
        if (n <= 0) {
            return 0;
        }
        // Left and right pointers
        int left = 1;
        int right = n;
        // Loop until the two pointers meet
        while (left <= right) {
            // Middle version of current range
            int middle = left + (right - left) / 2;
            // Check if the middle index is the bad version
            if (isBadVersion(middle)) {
                // Update right to the middle because the first
                // bad version can only be present in the left half
                right = middle;
            } else {
                left = middle + 1;
            }
            // If both left and right point to the same index,
            // then it should be the first bad version
            if (left == right) {
                return right;
            }
        }
        return n;
    }

    private boolean isBadVersion(int version) {
        return version == 4;
    }
}
