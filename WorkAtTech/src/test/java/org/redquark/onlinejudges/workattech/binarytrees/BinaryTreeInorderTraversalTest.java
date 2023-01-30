package org.redquark.onlinejudges.workattech.binarytrees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.binarytrees.BinaryTreeInorderTraversal.Node;

public class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal testObject = new BinaryTreeInorderTraversal();

    @Test
    public void testGetInorderTraversal() {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.left.right.left = new Node(7);
        root.right.left.left = new Node(8);
        List<Integer> expected = List.of(4, 2, 7, 5, 1, 8, 6, 3);
        assertEquals(expected, testObject.getInorderTraversal(root));
    }
}