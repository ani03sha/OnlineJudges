package org.redquark.onlinejudges.workattech.graph;

public class NumberOfIslands {

    public int getNumberOfIslands(int[][] surface) {
        // Special case
        if (surface == null || surface.length == 0) {
            return 0;
        }
        // Dimensions of the matrix
        int m = surface.length;
        int n = surface[0].length;
        // Count of islands
        int count = 0;
        // Loop through cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Process only those cells which have
                // value equal to 1
                if (surface[i][j] == 1) {
                    count += dfs(surface, i, j);
                }
            }
        }
        return count;
    }

    private int dfs(int[][] surface, int i, int j) {
        // Check if the indices are out of bounds
        if (i < 0 || i >= surface.length || j < 0 || j >= surface[0].length || surface[i][j] != 1) {
            return 0;
        }
        // Mark this cell visited
        surface[i][j] = 0;
        // DFS traversals for four sides
        dfs(surface, i + 1, j);
        dfs(surface, i - 1, j);
        dfs(surface, i, j + 1);
        dfs(surface, i, j - 1);
        return 1;
    }
}
