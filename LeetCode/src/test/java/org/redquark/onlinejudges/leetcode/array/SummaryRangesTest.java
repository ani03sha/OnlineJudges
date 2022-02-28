package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SummaryRangesTest {

    private final SummaryRanges testObject = new SummaryRanges();

    @Test
    public void testSummaryRanges() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> expected = Arrays.asList("0->2", "4->5", "7");
        assertEquals(expected, testObject.summaryRanges(nums));

        nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        expected = Arrays.asList("0", "2->4", "6", "8->9");
        assertEquals(expected, testObject.summaryRanges(nums));
    }
}