package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return null;
        }
        // Create the tree recursively
        return createTree(nums, 0, nums.length - 1);
    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        // Find the middle element
        int middle = start + (end - start) / 2;
        // Create the root of the subtree
        TreeNode root = new TreeNode(nums[middle]);
        // Create the left and right subtrees
        root.left = createTree(nums, start, middle - 1);
        root.right = createTree(nums, middle + 1, end);
        // Return the root
        return root;
    }
}
