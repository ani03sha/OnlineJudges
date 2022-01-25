package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidMountainArrayTest {

    private final ValidMountainArray testObject = new ValidMountainArray();

    @Test
    public void testValidMountainArray() {
        int[] arr = new int[]{2, 1};
        assertFalse(testObject.validMountainArray(arr));

        arr = new int[]{3, 5, 5};
        assertFalse(testObject.validMountainArray(arr));

        arr = new int[]{0, 3, 2, 1};
        assertTrue(testObject.validMountainArray(arr));

        arr = new int[]{1, 2, 3, 4};
        assertFalse(testObject.validMountainArray(arr));

        arr = new int[]{1, 2, 3, 4, 3, 2, 1};
        assertTrue(testObject.validMountainArray(arr));

        arr = new int[]{4, 3, 2, 1};
        assertFalse(testObject.validMountainArray(arr));

        arr = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        assertFalse(testObject.validMountainArray(arr));
    }
}