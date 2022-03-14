package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplifyPathTest {

    private final SimplifyPath testObject = new SimplifyPath();

    @Test
    public void testSimplifyPath() {
        String path = "/home/";
        assertEquals("/home", testObject.simplifyPath(path));

        path = "/../";
        assertEquals("/", testObject.simplifyPath(path));

        path = "/home//foo/";
        assertEquals("/home/foo", testObject.simplifyPath(path));
    }
}