package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCombinationsOfAPhoneNumberTest {

    private final LetterCombinationsOfAPhoneNumber testObject = new LetterCombinationsOfAPhoneNumber();

    @Test
    public void testLetterCombinations() {
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, testObject.letterCombinations(digits));

        digits = "";
        expected = Collections.emptyList();
        assertEquals(expected, testObject.letterCombinations(digits));

        digits = "2";
        expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, testObject.letterCombinations(digits));
    }
}