package org.redquark.onlinejudges.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateStackSequencesTest {

    private final ValidateStackSequences testObject = new ValidateStackSequences();

    @Test
    public void testValidateStackSequencesSolutionOne() {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] popped = new int[]{4, 5, 3, 2, 1};
        assertTrue(testObject.validateStackSequencesSolutionOne(pushed, popped));

        pushed = new int[]{1, 2, 3, 4, 5};
        popped = new int[]{4, 3, 5, 1, 2};
        assertFalse(testObject.validateStackSequencesSolutionOne(pushed, popped));
    }

    @Test
    public void testValidateStackSequencesSolutionTwo() {
        int[] pushed = new int[]{1, 2, 3, 4, 5};
        int[] popped = new int[]{4, 5, 3, 2, 1};
        assertTrue(testObject.validateStackSequencesSolutionTwo(pushed, popped));

        pushed = new int[]{1, 2, 3, 4, 5};
        popped = new int[]{4, 3, 5, 1, 2};
        assertFalse(testObject.validateStackSequencesSolutionTwo(pushed, popped));
    }
}