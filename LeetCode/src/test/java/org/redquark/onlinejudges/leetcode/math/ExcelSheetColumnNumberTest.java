package org.redquark.onlinejudges.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelSheetColumnNumberTest {

    private final ExcelSheetColumnNumber testObject = new ExcelSheetColumnNumber();

    @Test
    public void testTitleToNumber() {
        String columnTitle = "A";
        assertEquals(1, testObject.titleToNumber(columnTitle));

        columnTitle = "AB";
        assertEquals(28, testObject.titleToNumber(columnTitle));

        columnTitle = "ZY";
        assertEquals(701, testObject.titleToNumber(columnTitle));
    }
}