package org.redquark.onlinejudges.leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return -1;
        }
        // Rows and columns of the grid
        int rows = grid.length;
        int columns = grid[0].length;
        // Special case
        if (grid[0][0] == 1 || grid[rows - 1][columns - 1] == 1) {
            return -1;
        }
        // Directions
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, -1}, {-1, 1}, {-1, -1}, {1, 1}};
        // Visited array which keeps track of all the cells that have been visited
        boolean[][] visited = new boolean[rows][columns];
        // Update the source position
        visited[0][0] = true;
        // Queue to store coordinates of the cells
        Queue<int[]> coordinates = new LinkedList<>();
        // Add the first cell to the queue
        coordinates.add(new int[]{0, 0});
        // Shortest distance
        int distance = 0;
        // Loop until the queue is empty
        while (!coordinates.isEmpty()) {
            // Get the size of the queue
            int size = coordinates.size();
            // Loop for all the cells stored in the queue
            for (int i = 0; i < size; i++) {
                // Get the element from the front
                int[] current = coordinates.remove();
                // Check if we have reached to the end of the grid
                if (current[0] == rows - 1 && current[1] == columns - 1) {
                    return distance + 1;
                }
                // Otherwise, check for the eight directions
                for (int j = 0; j < 8; j++) {
                    // Next coordinates
                    int nextX = directions[j][0] + current[0];
                    int nextY = directions[j][1] + current[1];
                    // Visit this cell if not already
                    if (nextX >= 0 && nextX < rows && nextY >= 0 && nextY < columns
                            && !visited[nextX][nextY] && grid[nextX][nextY] == 0) {
                        coordinates.add(new int[]{nextX, nextY});
                        visited[nextX][nextY] = true;
                    }
                }
            }
            distance++;
        }
        return -1;
    }
}
