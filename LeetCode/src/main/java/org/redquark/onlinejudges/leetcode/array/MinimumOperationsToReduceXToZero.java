package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class MinimumOperationsToReduceXToZero {

    public int minOperationsOne(int[] nums, int x) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Length of the array
        int n = nums.length;
        // The target sum which we want to achieve is found
        // by subtracting x from total sum
        int target = -x;
        for (int num : nums) {
            target += num;
        }
        // If target sum is 0, it means we need all the elements
        // of the array to reduce x to 0
        if (target == 0) {
            return n;
        }
        // Map to store the prefix sum with the index where
        // it is found
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        // Store sum of 0 at index -1
        prefixSumMap.put(0, -1);
        // Variable to store prefix sum
        int prefixSum = 0;
        // Size of the subarray whose sum is target
        int size = -1;
        // Loop through the array
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            // Check if we have found the prefixSum - target in the map
            if (prefixSumMap.containsKey(prefixSum - target)) {
                size = Math.max(size, i - prefixSumMap.get(prefixSum - target));
            }
            // Store prefix sum in the map with its index
            prefixSumMap.put(prefixSum, i);
        }
        return size == -1 ? -1 : n - size;
    }

    public int minOperationsTwo(int[] nums, int x) {
        // Special case
        if (nums == null || nums.length == 0) {
            return -1;
        }
        // Length of the array
        int n = nums.length;
        // The target sum which we want to achieve is found
        // by subtracting x from total sum
        int target = -x;
        for (int num : nums) {
            target += num;
        }
        // If target sum is 0, it means we need all the elements
        // of the array to reduce x to 0
        if (target == 0) {
            return n;
        }
        // If target sum becomes negative, then return -1
        if (target < 0) {
            return -1;
        }
        // Variable to store prefix sum
        int prefixSum = 0;
        // Size of the subarray whose sum is target
        int size = -1;
        // Left and right pointers
        int left = 0;
        int right = 0;
        // Loop through the array
        while (right < n) {
            prefixSum += nums[right];
            // If prefix sum becomes greater than target, we will have
            // to reduce the size of the window
            while (prefixSum > target) {
                prefixSum -= nums[left];
                left++;
            }
            // If sum becomes equal to target
            if (prefixSum == target) {
                size = Math.max(size, right - left + 1);
            }
            right++;
        }
        return size == -1 ? -1 : n - size;
    }
}
