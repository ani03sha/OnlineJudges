package org.redquark.onlinejudges.leetcode.bitmagic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplementOfBase10IntegerTest {

    private final ComplementOfBase10Integer testObject = new ComplementOfBase10Integer();

    @Test
    public void testBitwiseComplement() {
        assertEquals(2, testObject.bitwiseComplement(5));
        assertEquals(1, testObject.bitwiseComplement(0));
        assertEquals(5, testObject.bitwiseComplement(10));
    }
}