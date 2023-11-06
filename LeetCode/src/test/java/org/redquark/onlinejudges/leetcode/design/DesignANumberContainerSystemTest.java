package org.redquark.onlinejudges.leetcode.design;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.leetcode.design.DesignANumberContainerSystem.NumberContainers;

public class DesignANumberContainerSystemTest {

    private final NumberContainers numberContainers = new NumberContainers();

    @Test
    public void test() {
        assertEquals(-1, numberContainers.find(10));
        numberContainers.change(2, 10);
        numberContainers.change(1, 10);
        numberContainers.change(3, 10);
        numberContainers.change(5, 10);
        assertEquals(1, numberContainers.find(10));
        numberContainers.change(1, 20);
        assertEquals(2, numberContainers.find(10));
    }
}