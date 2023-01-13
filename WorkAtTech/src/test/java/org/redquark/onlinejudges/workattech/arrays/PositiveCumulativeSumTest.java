package org.redquark.onlinejudges.workattech.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveCumulativeSumTest {

    private final PositiveCumulativeSum testObject = new PositiveCumulativeSum();

    @Test
    public void testGetPositiveCumulativeSum() {
        int[] nums = new int[]{1, -2, 3, 4, -6};
        List<Integer> expected = List.of(1, 2, 6);
        assertEquals(expected, testObject.getPositiveCumulativeSum(nums));

        nums = new int[]{1, -1, -1, -1, 1};
        expected = List.of(1);
        assertEquals(expected, testObject.getPositiveCumulativeSum(nums));

        nums = new int[]{1, 3, 5, 7};
        expected = List.of(1, 4, 9, 16);
        assertEquals(expected, testObject.getPositiveCumulativeSum(nums));
    }
}