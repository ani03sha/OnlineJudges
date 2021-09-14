package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseOnlyLettersTest {

    private final ReverseOnlyLetters testObject = new ReverseOnlyLetters();

    @Test
    public void testReverseOnlyLetters() {
        String s = "ab-cd";
        assertEquals("dc-ba", testObject.reverseOnlyLetters(s));

        s = "a-bC-dEf-ghIj";
        assertEquals("j-Ih-gfE-dCba", testObject.reverseOnlyLetters(s));

        s = "Test1ng-Leet=code-Q!";
        assertEquals("Qedo1ct-eeLg=ntse-T!", testObject.reverseOnlyLetters(s));
    }
}