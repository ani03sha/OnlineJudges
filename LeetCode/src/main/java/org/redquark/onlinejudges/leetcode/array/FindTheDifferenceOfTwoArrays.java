package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // List to store the array difference
        List<List<Integer>> arrayDifference = new ArrayList<>();
        // Special case
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return arrayDifference;
        }
        // Sets to store elements of both the arrays
        Set<Integer> elements1 = new HashSet<>();
        Set<Integer> elements2 = new HashSet<>();
        // Traverse through the array
        for (int num : nums1) {
            elements1.add(num);
        }
        for (int num : nums2) {
            elements2.add(num);
        }
        // Now find the difference of the arrays
        arrayDifference.add(new ArrayList<>());
        arrayDifference.add(new ArrayList<>());
        for (int num : elements1) {
            if (!elements2.contains(num)) {
                arrayDifference.get(0).add(num);
            }
        }
        for (int num : elements2) {
            if (!elements1.contains(num)) {
                arrayDifference.get(1).add(num);
            }
        }
        return arrayDifference;
    }
}
