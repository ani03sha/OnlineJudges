package org.redquark.onlinejudges.leetcode.backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateParenthesesTest {

    private final GenerateParentheses testObject = new GenerateParentheses();

    @Test
    public void testGenerateParenthesis() {
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expected, testObject.generateParenthesis(3));

        expected = List.of("()");
        assertEquals(expected, testObject.generateParenthesis(1));
    }
}