package org.redquark.onlinejudges.leetcode.graph;

/**
 * @author Anirudh Sharma
 */
public class IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        // Vertices in the graph
        int n = graph.length;
        // Our approach is to color each node in the graph.
        // There can be three colors -
        // 0 - uncolored
        // 1 - black
        // -1 - white
        int[] colors = new int[n];
        // Now, we will color a node and traverse its neighbors
        // and color the neighbors with another color
        for (int i = 0; i < n; i++) {
            // Do for only uncolored nodes
            if (colors[i] == 0 && dfs(graph, colors, 1, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] colors, int color, int index) {
        // For the colored node, if its color is same as the current color,
        // we will return true, else false
        if (colors[index] != 0) {
            return colors[index] != color;
        }
        // Now, we will color the node
        colors[index] = color;
        // Traverse for all the neighbors of the current node
        for (int neighbor : graph[index]) {
            if (dfs(graph, colors, -color, neighbor)) {
                return true;
            }
        }
        return false;
    }
}
