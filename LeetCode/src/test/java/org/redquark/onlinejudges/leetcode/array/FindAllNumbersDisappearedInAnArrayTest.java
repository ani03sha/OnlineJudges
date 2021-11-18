package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAllNumbersDisappearedInAnArrayTest {

    private final FindAllNumbersDisappearedInAnArray testObject = new FindAllNumbersDisappearedInAnArray();

    @Test
    public void testFindDisappearedNumbers() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = List.of(5, 6);
        assertEquals(expected, testObject.findDisappearedNumbers(nums));

        nums = new int[]{1, 1};
        expected = List.of(2);
        assertEquals(expected, testObject.findDisappearedNumbers(nums));
    }
}