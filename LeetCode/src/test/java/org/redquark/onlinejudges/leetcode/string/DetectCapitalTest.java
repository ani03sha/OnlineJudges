package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetectCapitalTest {

    private final DetectCapital testObject = new DetectCapital();

    @Test
    public void testDetectCapitalUse() {
        assertTrue(testObject.detectCapitalUse("INDIA"));
        assertFalse(testObject.detectCapitalUse("FlaG"));
        assertTrue(testObject.detectCapitalUse("leetcode"));
    }
}