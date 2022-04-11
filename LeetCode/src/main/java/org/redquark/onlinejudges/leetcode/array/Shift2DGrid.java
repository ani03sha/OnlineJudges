package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh Sharma
 */
public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        // Special case
        if (grid == null || grid.length == 0) {
            return Collections.emptyList();
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Total number of elements
        int total = m * n;
        // Effective value of k
        k %= total;
        // List to store the final result
        List<List<Integer>> result = new ArrayList<>();
        // Add empty lists equal to the number of rows
        for (int i = 0; i < m; i++) {
            result.add(new ArrayList<>());
        }
        // Populate the lists
        for (int i = 0; i < total; i++) {
            // Effective index
            int index = (i - k + m * n) % total;
            // Add the effective element to the list
            result.get(i / n).add(grid[index / n][index % n]);
        }
        return result;
    }
}
