package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {

    private final PartitioningIntoMinimumNumberOfDeciBinaryNumbers testObject =
            new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    public void testMinPartitions() {
        String n = "32";
        assertEquals(3, testObject.minPartitions(n));

        n = "82734";
        assertEquals(8, testObject.minPartitions(n));

        n = "27346209830709182346";
        assertEquals(9, testObject.minPartitions(n));
    }
}