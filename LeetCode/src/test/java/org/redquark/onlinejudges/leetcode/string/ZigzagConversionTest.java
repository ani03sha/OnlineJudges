package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagConversionTest {

    private final ZigzagConversion testObject = new ZigzagConversion();

    @Test
    public void testConvert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        assertEquals("PAHNAPLSIIGYIR", testObject.convert(s, numRows));

        s = "PAYPALISHIRING";
        numRows = 4;
        assertEquals("PINALSIGYAHRPI", testObject.convert(s, numRows));

        s = "A";
        numRows = 1;
        assertEquals("A", testObject.convert(s, numRows));
    }
}