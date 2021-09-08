package org.redquark.onlinejudges.leetcode.array;

/**
 * @author Anirudh Sharma
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Special case
        if (image == null || image.length == 0 || image[sr][sc] == newColor) {
            return image;
        }
        // DFS for all four directions
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int previousColor, int newColor) {
        // Base condition
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != previousColor) {
            return;
        }
        // Update the pixel with new color
        image[sr][sc] = newColor;
        // Recursively perform the operation in all four directions
        dfs(image, sr - 1, sc, previousColor, newColor);
        dfs(image, sr + 1, sc, previousColor, newColor);
        dfs(image, sr, sc - 1, previousColor, newColor);
        dfs(image, sr, sc + 1, previousColor, newColor);
    }
}
