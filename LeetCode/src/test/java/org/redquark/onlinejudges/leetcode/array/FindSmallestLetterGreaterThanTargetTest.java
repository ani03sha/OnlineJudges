package org.redquark.onlinejudges.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSmallestLetterGreaterThanTargetTest {

    private final FindSmallestLetterGreaterThanTarget testObject = new FindSmallestLetterGreaterThanTarget();

    @Test
    public void testNextGreatestLetter() {
        char[] letters = new char[]{'c', 'f', 'j'};
        char target = 'a';
        assertEquals('c', testObject.nextGreatestLetter(letters, target));

        letters = new char[]{'c', 'f', 'j'};
        target = 'c';
        assertEquals('f', testObject.nextGreatestLetter(letters, target));

        letters = new char[]{'x', 'x', 'y', 'y'};
        target = 'z';
        assertEquals('x', testObject.nextGreatestLetter(letters, target));
    }
}