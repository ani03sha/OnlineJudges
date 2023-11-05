package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheWinnerOfAnArrayGameTest {

    private final FindTheWinnerOfAnArrayGame testObject = new FindTheWinnerOfAnArrayGame();

    @Test
    public void testGetWinner() {
        int[] nums = new int[]{2, 1, 3, 5, 4, 6, 7};
        int k = 2;
        //assertEquals(5, testObject.getWinner(nums, k));

        nums = new int[]{3, 2, 1};
        k = 10;
        //assertEquals(3, testObject.getWinner(nums, k));

        nums = new int[]{1, 4, 5, 8, 2, 9, 12, 10, 65, 34, 68, 45};
        k = 5;
        assertEquals(68, testObject.getWinner(nums, k));
    }
}