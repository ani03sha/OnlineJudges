package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        // Special case
        if (arr == null || arr.length < 3) {
            return false;
        }
        // Length of the array
        int n = arr.length;
        // Inflexion point
        int inflexionPoint = 0;
        // Loop through the array
        for (int i = 0; i < n - 1; i++) {
            // If two adjacent elements are same, we will return false
            if (arr[i] == arr[i + 1]) {
                return false;
            }
            // If the next element is smaller than the current one,
            // then the current index will be the inflexion point
            else if (arr[i + 1] < arr[i]) {
                inflexionPoint = i;
                break;
            }
        }
        // For arrays to be divided by inflexion point, it
        // should be at index greater than 0.
        if (inflexionPoint > 0) {
            // Check for strictly decreasing part
            for (int i = inflexionPoint; i < n - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
