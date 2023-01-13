package org.redquark.onlinejudges.workattech.arrays;

public class CumulativeSum {

    public int[] getCumulativeSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
