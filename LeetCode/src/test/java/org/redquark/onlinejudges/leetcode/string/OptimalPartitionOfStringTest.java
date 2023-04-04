package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptimalPartitionOfStringTest {

    private final OptimalPartitionOfString testObject = new OptimalPartitionOfString();

    @Test
    public void testPartitionString() {
        String s = "abacaba";
        assertEquals(4, testObject.partitionString(s));

        s = "ssssss";
        assertEquals(6, testObject.partitionString(s));
    }
}