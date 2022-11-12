package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterInAStringTest {

    private final FirstUniqueCharacterInAString testObject = new FirstUniqueCharacterInAString();

    @Test
    public void testFirstUniqChar() {
        String s = "leetcode";
        assertEquals(0, testObject.firstUniqChar(s));

        s = "loveleetcode";
        assertEquals(2, testObject.firstUniqChar(s));

        s = "aabb";
        assertEquals(-1, testObject.firstUniqChar(s));
    }

    @Test
    public void testFirstUniqCharForVeryLargeStrings() {
        String s = "leetcode";
        assertEquals(0, testObject.firstUniqCharForVeryLargeStrings(s));

        s = "loveleetcode";
        assertEquals(2, testObject.firstUniqCharForVeryLargeStrings(s));

        s = "aabb";
        assertEquals(-1, testObject.firstUniqCharForVeryLargeStrings(s));
    }
}