package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QueueReconstructionByHeightTest {

    private final QueueReconstructionByHeight testObject = new QueueReconstructionByHeight();

    @Test
    public void testReconstructQueue() {
        int[][] people = new int[][]{
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6, 1},
                {5, 2}
        };
        int[][] expected = new int[][]{
                {5, 0},
                {7, 0},
                {5, 2},
                {6, 1},
                {4, 4},
                {7, 1}
        };
        assertArrayEquals(expected, testObject.reconstructQueue(people));

        people = new int[][]{
                {6, 0},
                {5, 0},
                {4, 0},
                {3, 2},
                {2, 2},
                {1, 4}
        };
        expected = new int[][]{
                {4, 0},
                {5, 0},
                {2, 2},
                {3, 2},
                {1, 4},
                {6, 0}
        };
        assertArrayEquals(expected, testObject.reconstructQueue(people));
    }
}