package org.redquark.onlinejudges.leetcode.enumeration;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SequentialDigitsTest {

    private final SequentialDigits testObject = new SequentialDigits();

    @Test
    public void testSequentialDigits() {
        int low = 100;
        int high = 300;
        List<Integer> expected = Arrays.asList(123, 234);
        assertEquals(expected, testObject.sequentialDigits(low, high));

        low = 1000;
        high = 13000;
        expected = Arrays.asList(1234, 2345, 3456, 4567, 5678, 6789, 12345);
        assertEquals(expected, testObject.sequentialDigits(low, high));
    }
}