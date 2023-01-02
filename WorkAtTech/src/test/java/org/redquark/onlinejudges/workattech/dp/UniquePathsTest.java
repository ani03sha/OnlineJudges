package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {

    private final UniquePaths testObject = new UniquePaths();

    @Test
    public void testUniquePaths() {
        assertEquals(3, testObject.uniquePaths(3, 2));
        assertEquals(3, testObject.uniquePaths(2, 3));
        assertEquals(6, testObject.uniquePaths(3, 3));
        assertEquals(2, testObject.uniquePaths(2, 2));
    }
}