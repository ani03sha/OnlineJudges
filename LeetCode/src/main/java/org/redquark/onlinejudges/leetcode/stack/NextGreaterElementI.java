package org.redquark.onlinejudges.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Anirudh Sharma
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Special case
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        // Mapping of current element to it next greater element
        Map<Integer, Integer> nextGreater = new HashMap<>();
        // Monotone stack
        Stack<Integer> monotone = new Stack<>();
        // Loop through the nums2 array
        for (int num : nums2) {
            while (!monotone.isEmpty() && monotone.peek() < num) {
                nextGreater.put(monotone.pop(), num);
            }
            monotone.push(num);
        }
        // Loop through the nums1 array to find the next greater element
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
