package org.redquark.onlinejudges.leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ZeroOneMatrix {

    public int[][] updateMatrix(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // Dimensions of the matrix
        int m = matrix.length;
        int n = matrix[0].length;
        // Queue to store the indices for BFS
        Queue<int[]> queue = new LinkedList<>();
        // Array to mark visited cells
        boolean[][] visited = new boolean[m][n];
        // Fill up the queue with the cells with zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
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
        while (!queue.isEmpty()) {
            // Size of the queue
            int size = queue.size();
            // Move in all possible directions
            for (int i = 0; i < size; i++) {
                // Current index of zero
                int[] coordinates = queue.poll();
                // Move in all four directions from the coordinates
                for (int[] direction : directions) {
                    if (coordinates != null) {
                        int x = coordinates[0] + direction[0];
                        int y = coordinates[1] + direction[1];
                        // Check for base condition
                        if (x < 0 || x > m - 1 || y < 0 || y > n - 1 || visited[x][y]) {
                            continue;
                        }
                        // Update the cell
                        matrix[x][y] = matrix[coordinates[0]][coordinates[1]] + 1;
                        // Add the visited cell to the queue
                        queue.offer(new int[]{x, y});
                        // Mark this cell as visited
                        visited[x][y] = true;
                    }
                }
            }
        }
        return matrix;
    }
}
