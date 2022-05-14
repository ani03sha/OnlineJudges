package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetworkDelayTimeTest {

    private final NetworkDelayTime testObject = new NetworkDelayTime();

    @Test
    public void testNetworkDelayTimeWithDFS() {
        int[][] times = new int[][]{
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        int n = 4;
        int k = 2;
        assertEquals(2, testObject.networkDelayTimeWithDFS(times, n, k));

        times = new int[][]{
                {1, 2, 1}
        };
        n = 2;
        k = 1;
        assertEquals(1, testObject.networkDelayTimeWithDFS(times, n, k));

        k = 2;
        assertEquals(-1, testObject.networkDelayTimeWithDFS(times, n, k));
    }
}