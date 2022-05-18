package org.redquark.onlinejudges.leetcode.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriticalConnectionsInANetworkTest {

    private final CriticalConnectionsInANetwork testObject = new CriticalConnectionsInANetwork();

    @Test
    public void testCriticalConnections() {
        int n = 4;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 3));
        assertEquals(expected, testObject.criticalConnections(n, connections));

        n = 2;
        connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        expected = new ArrayList<>();
        expected.add(Arrays.asList(0, 1));
        assertEquals(expected, testObject.criticalConnections(n, connections));
    }
}