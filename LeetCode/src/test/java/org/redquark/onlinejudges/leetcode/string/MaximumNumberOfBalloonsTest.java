package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfBalloonsTest {

    private final MaximumNumberOfBalloons testObject = new MaximumNumberOfBalloons();

    @Test
    public void testMaxNumberOfBalloons() {
        assertEquals(1, testObject.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, testObject.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, testObject.maxNumberOfBalloons("leetcode"));
    }
}