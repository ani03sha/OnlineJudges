package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;
import org.redquark.onlinejudges.workattech.graph.ValidPath.Circle;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPathTest {

    private final ValidPath testObject = new ValidPath();

    @Test
    public void testHasValidPath() {
        int m = 5;
        int n = 4;
        int r = 1;
        Circle[] circles = new Circle[]{
                new Circle(0, 2),
                new Circle(2, 3),
                new Circle(3, 0),
                new Circle(4, 1)
        };
        assertTrue(testObject.hasValidPath(m, n, r, circles));
    }
}