package org.redquark.onlinejudges.leetcode.unionfind;

import java.util.Arrays;
import java.util.Comparator;

public class CheckingExistenceOfEdgeLengthLimitedPaths {

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        // Special case
        if (n <= 0 || edgeList == null || edgeList.length == 0 || queries == null || queries.length == 0) {
            throw new IllegalArgumentException("Invalid input parameters!");
        }
        // Array to store the output
        boolean[] output = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) {
            queries[i] = new int[]{queries[i][0], queries[i][1], queries[i][2], i};
        }
        // Sort the arrays in increasing order
        Arrays.sort(queries, Comparator.comparingInt(a -> a[2]));
        Arrays.sort(edgeList, Comparator.comparingInt(a -> a[2]));
        // Instance of unionFind
        UnionFind unionFind = new UnionFind(n);
        int index = 0;
        for (int[] query : queries) {
            int u = query[0];
            int v = query[1];
            int limit = query[2];
            int qId = query[3];
            while (index < edgeList.length && edgeList[index][2] < limit) {
                unionFind.union(edgeList[index][0], edgeList[index][1]);
                index++;
            }
            output[qId] = unionFind.connected(u, v);
        }
        return output;
    }

    static class UnionFind {
        final int[] parent;
        final int[] rank;

        UnionFind(int n) {
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                this.parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px != py) {
                if (rank[px] < rank[py]) {
                    parent[px] = py;
                } else if (rank[px] > rank[py]) {
                    parent[py] = px;
                } else {
                    parent[py] = px;
                    rank[px]++;
                }
            }
        }

        boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    }
}
