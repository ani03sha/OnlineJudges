package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumbersTest {

    private final CompareVersionNumbers testObject = new CompareVersionNumbers();

    @Test
    public void testCompareVersion() {
        String version1 = "1.01";
        String version2 = "1.001";
        assertEquals(0, testObject.compareVersion(version1, version2));

        version1 = "1.0";
        version2 = "1.0.0";
        assertEquals(0, testObject.compareVersion(version1, version2));

        version1 = "0.1";
        version2 = "1.1";
        assertEquals(-1, testObject.compareVersion(version1, version2));
    }
}