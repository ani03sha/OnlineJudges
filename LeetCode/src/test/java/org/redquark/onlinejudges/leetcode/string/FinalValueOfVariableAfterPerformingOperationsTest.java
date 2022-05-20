package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueOfVariableAfterPerformingOperationsTest {

    private final FinalValueOfVariableAfterPerformingOperations testObject
            = new FinalValueOfVariableAfterPerformingOperations();

    @Test
    public void testFinalValueAfterOperations() {
        String[] operations = new String[]{"--X", "X++", "X++"};
        assertEquals(1, testObject.finalValueAfterOperations(operations));

        operations = new String[]{"++X", "++X", "X++"};
        assertEquals(3, testObject.finalValueAfterOperations(operations));

        operations = new String[]{"X++", "++X", "--X", "X--"};
        assertEquals(0, testObject.finalValueAfterOperations(operations));
    }
}