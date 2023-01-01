package org.redquark.onlinejudges.workattech.dp;

import java.util.Arrays;

public class CollectJewels {

    public int getMaxValue(JewelStone[] stones, int capacity) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Length of the array
        int n = stones.length;
        // Lookup table to store the calculated results
        int[][] lookup = new int[capacity + 1][n + 1];
        // Populate the table with default values
        Arrays.stream(lookup).forEach(a -> Arrays.fill(a, -1));
        return getMaxValue(stones, n - 1, capacity, lookup);
    }

    private int getMaxValue(JewelStone[] stones, int index, int capacity, int[][] lookup) {
        // Base case
        if (capacity == 0 || index < 0) {
            return 0;
        }
        // Check if this result has already been calculated
        if (lookup[capacity][index] != -1) {
            return lookup[capacity][index];
        }
        // If the current capacity is less than the
        // current weight to be taken
        if (capacity < stones[index].weight) {
            return getMaxValue(stones, index - 1, capacity, lookup);
        }
        // If the current capacity is more than the
        // current weight. In this case, we have two
        // choices either to take the weight or not
        // take the weight
        else {
            // When the weight is chosen
            int chosen = stones[index].value + getMaxValue(stones, index - 1, capacity - stones[index].weight, lookup);
            // When the weight is not chosen
            int notChosen = getMaxValue(stones, index - 1, capacity, lookup);
            // Take the maximum of both
            return lookup[capacity][index] = Math.max(chosen, notChosen);
        }
    }

    static class JewelStone {
        int weight;
        int value;

        JewelStone(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
