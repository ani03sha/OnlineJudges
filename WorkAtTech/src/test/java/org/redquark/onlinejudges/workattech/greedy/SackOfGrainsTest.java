package org.redquark.onlinejudges.workattech.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.greedy.SackOfGrains.Grain;

public class SackOfGrainsTest {

    private final SackOfGrains testObject = new SackOfGrains();

    @Test
    public void testMaxSackValue() {
        Grain[] grains = new Grain[]{
                new Grain(5, 20),
                new Grain(8, 20),
                new Grain(4, 15),
                new Grain(5, 8)
        };
        assertEquals(42.5, testObject.maxSackValue(grains, 12));
    }
}