package org.redquark.onlinejudges.leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class JumpGameIV {

    public int minJumps(int[] arr) {
        // Special case
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return 0;
        }
        // Length of the array
        int n = arr.length;
        // Value to keep track of the jumps
        int jumps = 0;
        // Map to store the mapping of the value at an index
        // as the key and the index as the value;
        Map<Integer, List<Integer>> mappings = new HashMap<>();
        // Populate the map
        for (int i = 0; i < n; i++) {
            mappings.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i);
        }
        // Queue for traversing breadth first search
        Queue<Integer> nodes = new LinkedList<>();
        // Array to mark the visited nodes
        boolean[] visited = new boolean[n];
        // Since we are already present at the first index,
        // we should update our queue and array for it
        nodes.offer(0);
        visited[0] = true;
        // Loop through the queue until it is empty
        while (!nodes.isEmpty()) {
            // Loop through all the nodes at the current level
            for (int i = nodes.size(); i > 0; i--) {
                if (!nodes.isEmpty()) {
                    // Get the value at the current index
                    int node = nodes.poll();
                    // If we have reached at the last node
                    if (node == n - 1) {
                        return jumps;
                    }
                    // Next indices where jump can be made
                    List<Integer> nextIndices = mappings.get(arr[node]);
                    // Add two indices
                    nextIndices.add(node - 1);
                    nextIndices.add(node + 1);
                    // Loop for all the indices in the next list
                    for (int index : nextIndices) {
                        if (index >= 0 && index < n && !visited[index]) {
                            visited[index] = true;
                            nodes.offer(index);
                        }
                    }
                    nextIndices.clear();
                }
            }
            // Update the jumps
            jumps++;
        }
        return 0;
    }
}
