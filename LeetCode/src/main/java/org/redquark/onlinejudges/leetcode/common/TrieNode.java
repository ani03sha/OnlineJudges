package org.redquark.onlinejudges.leetcode.common;

public class TrieNode {

    public final char data;
    public final TrieNode[] children;
    public boolean isLeaf;

    public TrieNode(char data) {
        this.data = data;
        this.children = new TrieNode[26];
    }
}