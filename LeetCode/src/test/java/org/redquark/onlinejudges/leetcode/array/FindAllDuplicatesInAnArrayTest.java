package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllDuplicatesInAnArrayTest {

    private final FindAllDuplicatesInAnArray testObject = new FindAllDuplicatesInAnArray();

    @Test
    public void testFindDuplicates() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(2, 3);
        assertEquals(expected, testObject.findDuplicates(nums));

        nums = new int[]{1, 1, 2};
        expected = List.of(1);
        assertEquals(expected, testObject.findDuplicates(nums));

        nums = new int[]{1};
        expected = Collections.emptyList();
        assertEquals(expected, testObject.findDuplicates(nums));
    }
}