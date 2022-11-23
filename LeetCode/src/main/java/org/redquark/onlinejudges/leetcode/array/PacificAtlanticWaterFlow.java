package org.redquark.onlinejudges.leetcode.array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PacificAtlanticWaterFlow {

    /**
     * Time complexity - O(m * n)
     * Space complexity - O(m * n)
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        // List to store all the valid cells
        List<List<Integer>> validCells = new ArrayList<>();
        // Special case
        if (heights == null || heights.length == 0) {
            return validCells;
        }
        // Dimensions of the island
        int m = heights.length;
        int n = heights[0].length;
        // Queues to perform the BFS for the pacific and atlantic cells
        Queue<int[]> pacific = new ArrayDeque<>();
        Queue<int[]> atlantic = new ArrayDeque<>();
        // Arrays to keep track of visited cells
        boolean[][] pacificVisited = new boolean[m][n];
        boolean[][] atlanticVisited = new boolean[m][n];
        // For the horizontal borders
        for (int i = 0; i < n; i++) {
            // Top row
            pacific.offer(new int[]{0, i});
            // Bottom row
            atlantic.offer(new int[]{m - 1, i});
            // Mark the cells visited
            pacificVisited[0][i] = true;
            atlanticVisited[m - 1][i] = true;
        }
        // For the vertical borders
        for (int i = 0; i < m; i++) {
            // Left column
            pacific.offer(new int[]{i, 0});
            // Right column
            atlantic.offer(new int[]{i, n - 1});
            // Mark the cells visited
            pacificVisited[i][0] = true;
            atlanticVisited[i][n - 1] = true;
        }
        // Array to keep track of four directions for a cell
        int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        // Perform BFS for both the queues
        bfs(heights, pacific, pacificVisited, directions);
        bfs(heights, atlantic, atlanticVisited, directions);
        // We will now loop through all the cells again and find out which
        // are cells that are valid for water flow. We can do that by checking
        // if a cell is present in both the visited arrays or not
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificVisited[i][j] && atlanticVisited[i][j]) {
                    validCells.add(List.of(i, j));
                }
            }
        }
        return validCells;
    }

    private void bfs(int[][] heights, Queue<int[]> cells, boolean[][] visited, int[][] directions) {
        // Loop until we have elements in the queue
        while (!cells.isEmpty()) {
            // Current cell
            int[] current = cells.remove();
            // Check in all four directions
            for (int[] direction : directions) {
                // Coordinates of the neighboring cell
                int x = current[0] + direction[0];
                int y = current[1] + direction[1];
                // Check if this cell is valid to move in
                if (x < 0 || y < 0 || x >= heights.length || y >= heights[0].length || visited[x][y] || heights[x][y] < heights[current[0]][current[1]]) {
                    continue;
                }
                // Mark the current cell visited
                visited[x][y] = true;
                // Add this to the queue
                cells.offer(new int[]{x, y});
            }
        }
    }
}
