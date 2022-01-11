package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class SumOfRootToLeafBinaryNumbers {

    public int sumRootToLeaf(TreeNode root) {
        // Special case - if the root is null
        if (root == null) {
            return 0;
        }
        // If both children of the node are null, then return only
        // the value present in the node
        if (root.left == null && root.right == null) {
            return root.val;
        }
        // If the left or right child is present, then we will update the
        // node value with the value equals to the binary weight
        // of the node in the sequence
        if (root.left != null) {
            root.left.val += root.val * 2;
        }
        if (root.right != null) {
            root.right.val += root.val * 2;
        }
        // Recurse for the subtrees
        return sumRootToLeaf(root.left) + sumRootToLeaf(root.right);
    }
}
