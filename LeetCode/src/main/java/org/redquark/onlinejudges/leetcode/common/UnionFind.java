package org.redquark.onlinejudges.leetcode.common;

public class UnionFind {

    // Sizes of disjoint components
    private final int[] sizes;
    // Roots of disjoint components
    private final int[] parents;

    public UnionFind(int nodeCount) {
        this.sizes = new int[nodeCount];
        this.parents = new int[nodeCount];
        // Make every node parent of itself which will
        // act as the individual component of size 1.
        for (int i = 0; i < nodeCount; i++) {
            this.sizes[i] = 1;
            this.parents[i] = i;
        }
    }

    public int find(int p) {
        while (p != this.parents[p]) {
            this.parents[p] = this.parents[this.parents[p]];
            p = this.parents[p];
        }
        return p;
    }

    public void union(int p, int q) {
        // Find roots of both nodes
        int pRoot = find(p);
        int qRoot = find(q);
        // If both roots are same then they are in the
        // same component
        if (pRoot == qRoot) {
            return;
        }
        // Otherwise, we will connect smaller component to
        // the bigger component
        if (this.sizes[p] > this.sizes[q]) {
            this.parents[qRoot] = pRoot;
            this.sizes[pRoot] += this.sizes[qRoot];
        } else {
            this.parents[pRoot] = qRoot;
            this.sizes[qRoot] += this.sizes[pRoot];
        }
    }
}
