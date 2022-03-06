package org.redquark.onlinejudges.leetcode.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountAllValidPickupAndDeliveryOptionsTest {

    private final CountAllValidPickupAndDeliveryOptions testObject = new CountAllValidPickupAndDeliveryOptions();

    @Test
    public void testCountOrders() {
        assertEquals(1, testObject.countOrders(1));
        assertEquals(6, testObject.countOrders(2));
        assertEquals(90, testObject.countOrders(3));
    }
}