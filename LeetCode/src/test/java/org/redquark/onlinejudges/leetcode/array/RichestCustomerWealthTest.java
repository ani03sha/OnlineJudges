package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTest {

    private final RichestCustomerWealth testObject = new RichestCustomerWealth();

    @Test
    public void testMaximumWealth() {
        int[][] accounts = new int[][]{
                {1, 2, 3},
                {3, 2, 1}
        };
        assertEquals(6, testObject.maximumWealth(accounts));

        accounts = new int[][]{
                {1, 5},
                {7, 3},
                {3, 5}
        };
        assertEquals(10, testObject.maximumWealth(accounts));

        accounts = new int[][]{
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        assertEquals(17, testObject.maximumWealth(accounts));
    }
}