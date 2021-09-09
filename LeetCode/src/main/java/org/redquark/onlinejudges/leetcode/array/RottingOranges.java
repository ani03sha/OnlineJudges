package org.redquark.onlinejudges.leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class RottingOranges {

    public int orangesRotting(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return -1;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Minutes to make all oranges rotten
        int minutes = 0;
        // Count of fresh oranges
        int fresh = 0;
        // Queue to store the indices of rotten oranges
        Queue<int[]> rottens = new LinkedList<>();
        // Array to mark visited cells
        boolean[][] visited = new boolean[m][n];
        // Loop over each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If we have encountered a rotten orange
                if (grid[i][j] == 2) {
                    rottens.offer(new int[]{i, j});
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        // Directions to move in
        final int[][] directions = {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        // Perform BFS approach
        while (!rottens.isEmpty()) {
            // Size of the queue
            int size = rottens.size();
            // Move in all possible directions
            for (int i = 0; i < size; i++) {
                // Current coordinate of rotten orange
                int[] coordinates = rottens.poll();
                if (coordinates != null) {
                    // Move in all possible directions
                    for (int[] direction : directions) {
                        int x = coordinates[0] + direction[0];
                        int y = coordinates[1] + direction[1];
                        // Check for base case
                        if (x < 0 || x > m - 1 || y < 0 || y > n - 1 || visited[x][y] || grid[x][y] == 0) {
                            continue;
                        }
                        // Mark the orange in the cell as rotten
                        grid[x][y] = 2;
                        // Add the rotten cell to the queue
                        rottens.offer(new int[]{x, y});
                        // Mark the cell as visited
                        visited[x][y] = true;
                        // Decrease count of fresh orange
                        fresh--;
                    }
                }
            }
            if (!rottens.isEmpty()) {
                minutes++;
            }
        }
        return fresh == 0 ? minutes : -1;
    }
}
