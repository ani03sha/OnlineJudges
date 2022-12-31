package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence testObject = new LongestCommonSubsequence();

    @Test
    public void testGetLengthOfLCS() {
        String s1 = "workattech";
        String s2 = "branch";
        assertEquals(4, testObject.getLengthOfLCS(s1, s2));
    }
}