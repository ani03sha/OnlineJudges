package org.redquark.onlinejudges.leetcode.graph;

import org.redquark.onlinejudges.leetcode.common.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anirudh Sharma
 */
public class CloneGraph {

    public Node cloneGraph(Node node) {
        // Special case
        if (node == null) {
            return null;
        }
        // Map to store the value of the node as key and
        // the reference of node as the value
        Map<Integer, Node> nodeMap = new HashMap<>();
        // Clone the graph
        return clone(node, nodeMap);
    }

    private Node clone(Node node, Map<Integer, Node> nodeMap) {
        // Check if the map contains the current value
        if (nodeMap.containsKey(node.val)) {
            return nodeMap.get(node.val);
        }
        // Create a deep copy of the current node
        Node deepCopy = new Node(node.val);
        // Store this node in the map
        nodeMap.put(node.val, deepCopy);
        // Loop through the adjacency list of the current node
        for (Node neighbor : node.neighbors) {
            // Add these neighbors to the adjacency list of
            // the deepCopy node
            deepCopy.neighbors.add(clone(neighbor, nodeMap));
        }
        return deepCopy;
    }
}
