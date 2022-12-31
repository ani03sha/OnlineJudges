package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceTest {

    private final EditDistance testObject = new EditDistance();

    @Test
    public void testMinOperations() {
        String s1 = "hello";
        String s2 = "seldom";
        assertEquals(3, testObject.minOperations(s1, s2));
    }
}