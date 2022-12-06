package org.redquark.onlinejudges.leetcode.array;

public class FindSmallestLetterGreaterThanTarget {

    /**
     * Time complexity - O(log(n))
     * Space complexity - O(1)
     */
    public char nextGreatestLetter(char[] letters, char target) {
        // Special case
        if (letters == null || letters.length == 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        // Length of the array
        int n = letters.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Loop until the pointers meet
        while (left <= right) {
            // Middle index
            int middle = left + (right - left) / 2;
            if (letters[middle] <= target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return letters[left % n];
    }
}
