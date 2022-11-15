package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Convert1DArrayInto2DArrayTest {

    private final Convert1DArrayInto2DArray testObject = new Convert1DArrayInto2DArray();

    @Test
    public void testConstruct2DArray() {
        int[] original = new int[]{1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] expected = new int[][]{
                {1, 2},
                {3, 4}
        };
        assertArrayEquals(expected, testObject.construct2DArray(original, m, n));

        original = new int[]{1, 2, 3};
        m = 1;
        n = 3;
        expected = new int[][]{
                {1, 2, 3}
        };
        assertArrayEquals(expected, testObject.construct2DArray(original, m, n));

        original = new int[]{1, 2};
        n = 1;
        expected = new int[][]{};
        assertArrayEquals(expected, testObject.construct2DArray(original, m, n));
    }
}