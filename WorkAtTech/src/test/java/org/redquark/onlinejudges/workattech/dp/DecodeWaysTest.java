package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeWaysTest {

    private final DecodeWays testObject = new DecodeWays();

    @Test
    public void testNumDecodings() {
        String s = "123";
        assertEquals(3, testObject.numDecodings(s));

        s = "36";
        assertEquals(1, testObject.numDecodings(s));

        s = "106";
        assertEquals(1, testObject.numDecodings(s));

        s = "306";
        assertEquals(0, testObject.numDecodings(s));
    }
}