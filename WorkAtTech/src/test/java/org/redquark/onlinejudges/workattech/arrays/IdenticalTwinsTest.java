package org.redquark.onlinejudges.workattech.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdenticalTwinsTest {

    private final IdenticalTwins testObject = new IdenticalTwins();

    @Test
    public void testGetIdenticalTwinsCount() {
        int[] nums = new int[]{1, 2, 3, 2, 1};
        assertEquals(2, testObject.getIdenticalTwinsCount(nums));

        nums = new int[]{1, 2, 2, 3, 2, 1};
        assertEquals(4, testObject.getIdenticalTwinsCount(nums));

        nums = new int[]{1, 1, 1, 1};
        assertEquals(6, testObject.getIdenticalTwinsCount(nums));
    }
}