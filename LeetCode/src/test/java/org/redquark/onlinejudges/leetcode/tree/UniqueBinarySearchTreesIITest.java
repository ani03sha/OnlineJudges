package org.redquark.onlinejudges.leetcode.tree;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueBinarySearchTreesIITest {

    private final UniqueBinarySearchTreesII testObject = new UniqueBinarySearchTreesII();

    @Test
    public void testGenerateTrees() {
        List<TreeNode> expected = testObject.generateTrees(3);
        List<Integer> values = Arrays.asList(1, 1, 2, 3, 3);
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).val, values.get(i));
        }

        expected = testObject.generateTrees(1);
        values = Collections.singletonList(1);
        assertEquals(expected.get(0).val, values.get(0));
    }
}