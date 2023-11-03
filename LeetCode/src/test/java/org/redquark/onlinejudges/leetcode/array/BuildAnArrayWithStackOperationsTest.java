package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildAnArrayWithStackOperationsTest {

    private final BuildAnArrayWithStackOperations testObject = new BuildAnArrayWithStackOperations();

    @Test
    public void buildArray() {
        int[] target = new int[]{1, 3};
        int n = 3;
        List<String> expected = List.of("Push", "Push", "Pop", "Push");
        assertEquals(expected, testObject.buildArray(target, n));

        target = new int[]{1, 2, 3};
        expected = List.of("Push", "Push", "Push");
        assertEquals(expected, testObject.buildArray(target, n));

        target = new int[]{1, 2};
        n = 4;
        expected = List.of("Push", "Push");
        assertEquals(expected, testObject.buildArray(target, n));
    }
}