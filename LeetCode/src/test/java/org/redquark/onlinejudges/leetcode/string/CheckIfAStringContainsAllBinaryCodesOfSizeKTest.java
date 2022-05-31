package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfAStringContainsAllBinaryCodesOfSizeKTest {

    private final CheckIfAStringContainsAllBinaryCodesOfSizeK testObject = new CheckIfAStringContainsAllBinaryCodesOfSizeK();

    @Test
    public void testHasAllCodes() {
        String s = "00110110";
        int k = 2;
        assertTrue(testObject.hasAllCodes(s, k));

        s = "0110";
        k = 1;
        assertTrue(testObject.hasAllCodes(s, k));
    }
}