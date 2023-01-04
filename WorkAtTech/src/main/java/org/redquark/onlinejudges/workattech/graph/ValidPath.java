package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class ValidPath {

    public boolean hasValidPath(int m, int n, int r, Circle[] circles) {
        // Create a matrix of dimensions m * n
        int[][] matrix = new int[m + 1][n + 1];
        // Populate the cells
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                for (Circle circle : circles) {
                    if (insideCircle(i, j, circle.x, circle.y, r)) {
                        matrix[i][j] = -1;
                    }
                }
            }
        }
        // If the starting cell itself is inside the circle
        if (matrix[0][0] == -1) {
            return false;
        }
        // Queue to store cells
        Queue<int[]> cells = new ArrayDeque<>();
        // Array to store visited cells
        boolean[][] visited = new boolean[m + 1][n + 1];
        // Process the first cell
        cells.offer(new int[]{0, 0});
        visited[0][0] = true;
        // Directions array
        int[][] directions = new int[][]{
                {0, -1},
                {0, 1},
                {1, 0},
                {-1, 0},
                {-1, -1},
                {1, 1},
                {-1, 1},
                {1, -1}
        };
        // Loop until the queue has nodes
        while (!cells.isEmpty()) {
            int[] cell = cells.remove();
            int x = cell[0];
            int y = cell[1];
            // Loop through in all directions
            for (int[] direction : directions) {
                int xNew = x + direction[0];
                int yNew = y + direction[1];
                if (xNew < 0 || xNew > m || yNew < 0 || yNew > n || visited[xNew][yNew] || matrix[xNew][yNew] == -1) {
                    continue;
                }
                // Mark this cell as visited
                visited[xNew][yNew] = true;
                // Add this cell to queue
                cells.offer(new int[]{xNew, yNew});
            }
        }
        return visited[m][n];
    }

    private boolean insideCircle(int i, int j, int x, int y, int r) {
        int dx = Math.abs(i - x);
        int dy = Math.abs(j - y);
        return Math.sqrt(dx * dx + dy * dy) <= r;
    }

    static class Circle {
        int x;
        int y;

        public Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
