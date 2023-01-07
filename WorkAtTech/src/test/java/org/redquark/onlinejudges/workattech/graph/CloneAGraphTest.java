package org.redquark.onlinejudges.workattech.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.redquark.onlinejudges.workattech.graph.CloneAGraph.Node;

public class CloneAGraphTest {

    private final CloneAGraph testObject = new CloneAGraph();

    @Test
    public void testCloneGraph() {
        Node zero = new Node(0);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        zero.neighbors = new ArrayList<>() {{
            add(one);
            add(two);
            add(three);
        }};
        one.neighbors = new ArrayList<>() {{
            add(zero);
        }};
        two.neighbors = new ArrayList<>() {{
            add(zero);
            add(three);
        }};
        three.neighbors = new ArrayList<>() {{
            add(zero);
            add(two);
        }};
        Node expected = testObject.cloneGraph(zero);
        assertEquals(0, expected.value);
        assertEquals(3, expected.neighbors.size());
    }
}