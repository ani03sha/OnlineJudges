package org.redquark.onlinejudges.leetcode.unionfind;

import org.redquark.onlinejudges.leetcode.common.UnionFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class SmallestStringWithSwaps {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        // Special case
        if (s == null || s.isEmpty() || pairs == null || pairs.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // Create Union-Find object populate it
        UnionFind unionFind = new UnionFind(n);
        for (List<Integer> pair : pairs) {
            unionFind.union(pair.get(0), pair.get(1));
        }
        // Now, create a graph
        Map<Integer, List<Character>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = unionFind.find(i);
            graph.putIfAbsent(root, new ArrayList<>());
            graph.get(root).add(s.charAt(i));
        }
        // Sort all the lists in the graph lexicographically
        for (List<Character> characters : graph.values()) {
            Collections.sort(characters);
        }
        // StringBuilder to create the output
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            List<Character> characters = graph.get(unionFind.find(i));
            output.append(characters.remove(0));
        }
        return output.toString();
    }
}
