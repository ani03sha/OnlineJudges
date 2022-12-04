package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralizedAbbreviationTest {

    private final GeneralizedAbbreviation testObject = new GeneralizedAbbreviation();

    @Test
    public void testGenerateAbbreviations() {
        String word = "word";
        List<String> expected = Arrays.asList("4", "3d", "2r1", "2rd", "1o2", "1o1d", "1or1", "1ord", "w3", "w2d", "w1r1", "w1rd", "wo2", "wo1d", "wor1", "word");
        assertEquals(expected, testObject.generateAbbreviations(word));
    }
}