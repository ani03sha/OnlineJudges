package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        // If nums1 is smaller than nums2
        if (nums1.length < nums2.length) {
            return intersect(nums2, nums1);
        }
        // Map to store all the elements in bigger array with their frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // List to store all the elements
        List<Integer> elements = new ArrayList<>();
        // Loop through nums1 and add their frequencies
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Loop through nums2
        for (int num : nums2) {
            // Check if the value is already in the map
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                elements.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }
        // Array to store output
        int[] result = new int[elements.size()];
        // Fill this array with list values
        for (int i = 0; i < elements.size(); i++) {
            result[i] = elements.get(i);
        }
        return result;
    }
}
