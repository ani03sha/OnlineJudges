package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.design.DesignUndergroundSystem.UndergroundSystem;

public class DesignUndergroundSystemTest {

    @Test
    public void test() {
        UndergroundSystem testObject = new UndergroundSystem();
        testObject.checkIn(45, "Leyton", 3);
        testObject.checkIn(32, "Paradise", 8);
        testObject.checkIn(27, "Leyton", 10);
        testObject.checkOut(45, "Waterloo", 15);
        testObject.checkOut(27, "Waterloo", 20);
        testObject.checkOut(32, "Cambridge", 22);
        assertEquals(14.00000, testObject.getAverageTime("Paradise", "Cambridge"));
        assertEquals(11.00000, testObject.getAverageTime("Leyton", "Waterloo"));
        testObject.checkIn(10, "Leyton", 24);
        assertEquals(11.00000, testObject.getAverageTime("Leyton", "Waterloo"));
        testObject.checkOut(10, "Waterloo", 38);
        assertEquals(12.00000, testObject.getAverageTime("Leyton", "Waterloo"));
    }
}