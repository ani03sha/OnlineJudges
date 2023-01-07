package org.redquark.onlinejudges.workattech.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CloneAGraph {

    Node cloneGraph(Node node) {
        // Special case
        if (node == null) {
            return null;
        }
        // Create root of the cloned graph
        Node clone = new Node(node.value);
        // Mappings of the original node and cloned node
        Map<Node, Node> nodeMappings = new HashMap<>();
        // Add root and its clone
        nodeMappings.put(node, clone);
        // Queue to perform BFS on graph
        Queue<Node> nodes = new LinkedList<>();
        // Add root node to the queue
        nodes.offer(node);
        // Loop until the queue is empty
        while (!nodes.isEmpty()) {
            // Pop the node at the front of the queue
            Node current = nodes.remove();
            // Traverse all the neighbors of the node
            for (Node neighbor : current.neighbors) {
                // Create clones if we have not already traversed this node
                if (!nodeMappings.containsKey(neighbor)) {
                    nodeMappings.put(neighbor, new Node(neighbor.value));
                    // Add the neighbor to the queue
                    nodes.offer(neighbor);
                }
                // Add the cloned neighbor to the cloned node
                nodeMappings.get(current).neighbors.add(nodeMappings.get(neighbor));
            }
        }
        return clone;
    }

    static class Node {
        int value;
        ArrayList<Node> neighbors = new ArrayList<>();

        Node(int val) {
            value = val;
        }
    }
}
