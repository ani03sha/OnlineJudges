package org.redquark.onlinejudges.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangingAnIPAddressTest {

    private final DefangingAnIPAddress testObject = new DefangingAnIPAddress();

    @Test
    public void testDefangIPaddress() {
        String address = "1.1.1.1";
        assertEquals("1[.]1[.]1[.]1", testObject.defangIPaddress(address));

        address = "255.100.50.0";
        assertEquals("255[.]100[.]50[.]0", testObject.defangIPaddress(address));
    }
}