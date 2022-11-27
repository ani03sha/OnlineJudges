package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCasePermutationTest {

    private final LetterCasePermutation testObject = new LetterCasePermutation();

    @Test
    public void testLetterCasePermutation() {
        String s = "a1b2";
        List<String> expected = List.of("A1B2", "A1b2", "a1B2", "a1b2");
        assertEquals(expected, testObject.letterCasePermutation(s));

        s = "3z4";
        expected = List.of("3Z4", "3z4");
        assertEquals(expected, testObject.letterCasePermutation(s));
    }
}