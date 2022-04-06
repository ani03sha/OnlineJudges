package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumWithMultiplicityTest {

    private final ThreeSumWithMultiplicity testObject = new ThreeSumWithMultiplicity();

    @Test
    public void testThreeSumMulti() {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int target = 8;
        assertEquals(20, testObject.threeSumMulti(arr, target));

        arr = new int[]{1, 1, 2, 2, 2, 2};
        target = 5;
        assertEquals(12, testObject.threeSumMulti(arr, target));
    }
}