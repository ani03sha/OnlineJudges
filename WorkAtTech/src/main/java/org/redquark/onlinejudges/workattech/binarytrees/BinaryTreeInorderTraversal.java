package org.redquark.onlinejudges.workattech.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> getInorderTraversal(Node root) {
        List<Integer> traversedNodes = new ArrayList<>();
        getInorderTraversal(root, traversedNodes);
        return traversedNodes;
    }

    private void getInorderTraversal(Node node, List<Integer> traversedNodes) {
        // Base case
        if (node == null) {
            return;
        }
        getInorderTraversal(node.left, traversedNodes);
        traversedNodes.add(node.data);
        getInorderTraversal(node.right, traversedNodes);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
}
