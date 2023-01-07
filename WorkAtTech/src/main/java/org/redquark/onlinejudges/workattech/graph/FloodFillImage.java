package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class FloodFillImage {

    public int[][] applyFloodFill(int[][] image, int x, int y, int color) {
        // Special case
        if (image == null || image.length == 0 || image[x][y] == color) {
            return image;
        }
        // Dimensions of the image
        int m = image.length;
        int n = image[0].length;
        // Queue to store the nodes for BFS traversal
        Queue<int[]> nodes = new ArrayDeque<>();
        // Directions array
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        // Process the given starting cell
        nodes.offer(new int[]{x, y});
        // Previous color
        int previousColor = image[x][y];
        // Loop until the queue has nodes
        while (!nodes.isEmpty()) {
            // Get the current cell
            int[] cell = nodes.remove();
            // Coordinates of the cell
            int a = cell[0];
            int b = cell[1];
            // Color this cell
            image[a][b] = color;
            // Traverse the neighbors
            for (int[] direction : directions) {
                int aNew = a + direction[0];
                int bNew = b + direction[1];
                // Check if this cell is valid or not
                if (aNew < 0 || aNew >= m || bNew < 0 || bNew >= n || image[aNew][bNew] != previousColor) {
                    continue;
                }
                // Color this cell and add it to the queue
                image[aNew][bNew] = color;
                nodes.offer(new int[]{aNew, bNew});
            }
        }
        return image;
    }
}
