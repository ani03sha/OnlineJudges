package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    private final GroupAnagrams testObject = new GroupAnagrams();

    @Test
    public void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("tan", "nat"));
        expected.add(Arrays.asList("eat", "tea", "ate"));
        expected.add(Collections.singletonList("bat"));
        assertEquals(expected, testObject.groupAnagrams(strs));

        strs = new String[]{""};
        expected = new ArrayList<>();
        expected.add(Collections.singletonList(""));
        assertEquals(expected, testObject.groupAnagrams(strs));

        strs = new String[]{"a"};
        expected = new ArrayList<>();
        expected.add(Collections.singletonList("a"));
        assertEquals(expected, testObject.groupAnagrams(strs));
    }
}