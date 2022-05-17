package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anirudh Sharma
 */
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Special case
        if (original == null) {
            return cloned;
        }
        // Queues to traverse through the tree in the BFS
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        // Add root nodes to the queues
        q1.offer(original);
        q2.offer(cloned);
        // Loop until the queues are empty
        while (!q1.isEmpty() && !q2.isEmpty()) {
            // Get the nodes in the front of the queues
            TreeNode c1 = q1.remove();
            TreeNode c2 = q2.remove();
            // If the current front is equal to the target node,
            // we will return the corresponding node from the
            // clone tree
            if (c1 == target) {
                return c2;
            }
            // Add childrent nodes if they are available
            if (c1.left != null && c2.left != null) {
                q1.offer(c1.left);
                q2.offer(c2.left);
            }
            if (c1.right != null && c2.right != null) {
                q1.offer(c1.right);
                q2.offer(c2.right);
            }
        }
        return null;
    }
}
