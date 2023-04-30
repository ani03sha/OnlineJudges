package org.redquark.onlinejudges.leetcode.unionfind;

import java.util.Arrays;

public class RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        // Special case
        if (edges == null || edges.length == 0) {
            return -1;
        }
        // Sort the array by type
        Arrays.sort(edges, (a, b) -> b[0] - a[0]);
        // Count
        int count = 0;
        // Perform union-find for Alice and Bob
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);
        // Traverse through the edges
        for (int[] edge : edges) {
            int type = edge[0];
            int u = edge[1];
            int v = edge[2];
            switch (type) {
                case 3 -> {
                    if (alice.union(u, v) | bob.union(u, v)) {
                        count++;
                    }
                }
                case 2 -> {
                    if (bob.union(u, v)) {
                        count++;
                    }
                }
                case 1 -> {
                    if (alice.union(u, v)) {
                        count++;
                    }
                }
            }
        }
        return alice.connected() && bob.connected() ? edges.length - count : -1;
    }

    static class UnionFind {
        final int[] components;
        int distinctComponents;

        UnionFind(int n) {
            this.components = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                this.components[i] = i;
            }
            this.distinctComponents = n;
        }

        private boolean union(int x, int y) {
            if (find(x) != find(y)) {
                components[find(x)] = y;
                distinctComponents--;
                return true;
            }
            return false;
        }

        private int find(int x) {
            if (components[x] != x) {
                components[x] = find(components[x]);
            }
            return components[x];
        }

        private boolean connected() {
            return distinctComponents == 1;
        }
    }
}
