package org.redquark.onlinejudges.leetcode.tree;

import org.redquark.onlinejudges.leetcode.common.TreeNode;

/**
 * @author Anirudh Sharma
 */
public class RootEqualsSumOfChildren {

    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
