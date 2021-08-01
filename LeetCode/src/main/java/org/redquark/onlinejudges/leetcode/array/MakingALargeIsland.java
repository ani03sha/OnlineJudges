package org.redquark.onlinejudges.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Anirudh Sharma
 */
public class MakingALargeIsland {

    public int largestIsland(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Order of the grid
        int n = grid.length;
        // Map to store the grid id and the corresponding area
        Map<Integer, Integer> gridMap = new HashMap<>();
        // Since every cell with zero cannot be a part of the
        // larger island, we map it with 0 with grid id 0.
        gridMap.put(0, 0);
        // Grid id, since 0 and 1 are reserved as elements of
        // the grid, we will start it with 2
        int gridId = 2;
        // Populate the grid map by traversing the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // We will only need cells with 1
                if (grid[i][j] == 1) {
                    // Get the area
                    int area = getArea(grid, i, j, gridId);
                    // Put this mapping in the map
                    gridMap.put(gridId, area);
                    gridId++;
                }
            }
        }
        // Final area of the largest island after converting
        // a zero to one - starting from the cell with first one
        int finalArea = gridMap.getOrDefault(2, 0);
        // Loop through the entire grid to check for the maximum area
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check for all zeroes in tne grid one by one
                if (grid[i][j] == 0) {
                    // Set to store the visited cells
                    Set<Integer> visited = new HashSet<>();
                    // Add all neighbors
                    visited.add(i > 0 ? grid[i - 1][j] : 0);
                    visited.add(i < n - 1 ? grid[i + 1][j] : 0);
                    visited.add(j > 0 ? grid[i][j - 1] : 0);
                    visited.add(j < n - 1 ? grid[i][j + 1] : 0);
                    // Current area including current cell
                    int area = 1;
                    for (int id : visited) {
                        area += gridMap.get(id);
                    }
                    // Update the maximum, if required
                    finalArea = Math.max(finalArea, area);
                }
            }
        }
        return finalArea;
    }

    private int getArea(int[][] grid, int i, int j, int gridId) {
        // Base condition
        if (i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) {
            return 0;
        }
        // Update the current cell with grid id
        grid[i][j] = gridId;
        // Use DFS to check for all neighbors
        return 1 + getArea(grid, i + 1, j, gridId)
                + getArea(grid, i, j + 1, gridId)
                + getArea(grid, i - 1, j, gridId)
                + getArea(grid, i, j - 1, gridId);
    }
}
