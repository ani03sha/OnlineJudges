package org.redquark.onlinejudges.leetcode.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPickIndex {

    private final int[] nums;
    private final Random random;

    public RandomPickIndex(int[] nums) {
        this.nums = nums;
        this.random = new Random();
    }

    public int pickOne(int target) {
        // List to store the indices of the target
        // in the array
        List<Integer> indices = new ArrayList<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        // Size of the list
        int size = indices.size();
        return indices.get(random.nextInt(size));
    }

    public int pickTwo(int target) {
        // Count of the numbers equal to target in the array
        int count = 0;
        // Random index corresponds to the target element
        int randomIndex = 0;
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the target
            if (nums[i] == target) {
                // Update the count
                count++;
                // Pick the current number with probability 1/count
                if (random.nextInt(count) == 0) {
                    randomIndex = i;
                }
            }
        }
        return randomIndex;
    }
}
