package org.redquark.onlinejudges.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        // If the size of the first array is smaller than
        // the second one
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }
        // Set to store all the elements in the bigger array
        Set<Integer> elements = new HashSet<>();
        // Set to store the intersection elements
        Set<Integer> intersection = new HashSet<>();
        // Populate the elements set
        for (int num : nums1) {
            elements.add(num);
        }
        // Loop through the second array and add intersection
        // elements to the set
        for (int num : nums2) {
            if (elements.contains(num)) {
                intersection.add(num);
            }
        }
        // Array to store the final output
        int[] result = new int[intersection.size()];
        // Populate this array
        int i = 0;
        for (int value : intersection) {
            result[i] = value;
            i++;
        }
        return result;
    }
}
