package org.redquark.onlinejudges.workattech.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.dp.CollectJewels.JewelStone;

public class CollectJewelsTest {

    private final CollectJewels testObject = new CollectJewels();

    @Test
    public void testGetMaxValue() {
        JewelStone[] stones = new JewelStone[]{
                new JewelStone(1, 3),
                new JewelStone(2, 4),
                new JewelStone(3, 5),
                new JewelStone(4, 7)
        };
        int capacity = 5;
        assertEquals(10, testObject.getMaxValue(stones, capacity));
    }
}