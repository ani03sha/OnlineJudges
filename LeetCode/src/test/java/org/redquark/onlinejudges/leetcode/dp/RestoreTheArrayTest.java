package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestoreTheArrayTest {

    private final RestoreTheArray testObject = new RestoreTheArray();

    @Test
    public void testNumberOfArrays() {
        String s = "1000";
        int k = 10000;
        assertEquals(1, testObject.numberOfArrays(s, k));

        s = "1000";
        k = 10;
        assertEquals(0, testObject.numberOfArrays(s, k));

        s = "1317";
        k = 2000;
        assertEquals(8, testObject.numberOfArrays(s, k));
    }
}