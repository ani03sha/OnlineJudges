package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    private final Triangle testObject = new Triangle();

    @Test
    public void testMinimumTotal() {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        assertEquals(11, testObject.minimumTotal(triangle));

        triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(-10));
        assertEquals(-10, testObject.minimumTotal(triangle));
    }
}