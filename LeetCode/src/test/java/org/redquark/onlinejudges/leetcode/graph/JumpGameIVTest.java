package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpGameIVTest {

    private final JumpGameIV testObject = new JumpGameIV();

    @Test
    public void testMinJumps() {
        int[] arr = new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404};
        assertEquals(3, testObject.minJumps(arr));

        arr = new int[]{7};
        assertEquals(0, testObject.minJumps(arr));

        arr = new int[]{7, 6, 9, 6, 9, 6, 9, 7};
        assertEquals(1, testObject.minJumps(arr));

        arr = new int[]{6, 1, 9};
        assertEquals(2, testObject.minJumps(arr));
    }
}