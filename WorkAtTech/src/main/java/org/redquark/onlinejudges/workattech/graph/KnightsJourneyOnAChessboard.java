package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class KnightsJourneyOnAChessboard {

    public int minMovesRequired(int n, Cell start, Cell end) {
        // Special case
        if (n <= 0 || start == null || end == null) {
            return -1;
        }
        // Shortest path array
        int[][] shortestPath = new int[n + 1][n + 1];
        Arrays.stream(shortestPath).forEach(a -> Arrays.fill(a, -1));
        // Eight directions to move in
        int[][] directions = new int[][]{
                {2, -1},
                {2, 1},
                {-2, -1},
                {-2, 1},
                {1, -2},
                {1, 2},
                {-1, -2},
                {-1, 2}
        };
        // Queue to perform BFS
        Queue<Cell> cells = new ArrayDeque<>();
        // Add start node to the queue
        cells.offer(new Cell(start.x, start.y));
        // Add the distance to mapping
        shortestPath[start.x][start.y] = 0;
        // Loop through the queue
        while (!cells.isEmpty()) {
            // Get the first cell from the front
            Cell cell = cells.remove();
            int x = cell.x;
            int y = cell.y;
            // Check in all eight directions
            for (int[] direction : directions) {
                int xNew = x + direction[0];
                int yNew = y + direction[1];
                // Check if the indices are valid or not
                if (xNew < 1 || xNew > n || yNew < 1 || yNew > n || shortestPath[xNew][yNew] != -1) {
                    continue;
                }
                cells.offer(new Cell(xNew, yNew));
                shortestPath[xNew][yNew] = shortestPath[x][y] + 1;
            }
        }
        return shortestPath[end.x][end.y];
    }

    static class Cell {
        int x;
        int y;

        Cell(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
