package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class MaximumProductDifferenceBetweenTwoPairs {

    public int maxProductDifference(int[] nums) {
        // Two smallest elements
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        // Two biggest elements
        int biggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;
        // Loop through the array
        for (int num : nums) {
            // Find two smallest numbers
            if (num <= smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num <= secondSmallest) {
                secondSmallest = num;
            }
            // Find two biggest numbers
            if (num >= biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else if (num >= secondBiggest) {
                secondBiggest = num;
            }
        }
        return biggest * secondBiggest - smallest * secondSmallest;
    }
}
