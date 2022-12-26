package org.redquark.onlinejudges.leetcode.design;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            // Perform preorder on the tree
            return serialize(root, new StringBuilder()).toString();
        }

        private StringBuilder serialize(TreeNode root, StringBuilder serializedTree) {
            // Base case
            if (root == null) {
                return serializedTree.append("null");
            }
            serializedTree.append(root.val).append(",");
            serialize(root.left, serializedTree).append(",");
            serialize(root.right, serializedTree);
            return serializedTree;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            // Split the data by comma
            String[] nodes = data.split(",");
            // Add this data to a queue
            Queue<String> queue = new ArrayDeque<>(Arrays.asList(nodes));
            return deserialize(queue);
        }

        private TreeNode deserialize(Queue<String> queue) {
            // Get the node's value
            String val = queue.remove();
            // For the null node
            if (val.equals("null")) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(val));
            root.left = deserialize(queue);
            root.right = deserialize(queue);
            return root;
        }
    }
}
