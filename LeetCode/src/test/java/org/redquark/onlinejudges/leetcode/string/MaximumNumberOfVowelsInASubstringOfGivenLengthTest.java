package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    private final MaximumNumberOfVowelsInASubstringOfGivenLength testObject = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    public void testMaxVowels() {
        String s = "abciiidef";
        int k = 3;
        assertEquals(3, testObject.maxVowels(s, k));

        s = "aeiou";
        k = 2;
        assertEquals(2, testObject.maxVowels(s, k));

        s = "leetcode";
        k = 3;
        assertEquals(2, testObject.maxVowels(s, k));
    }
}